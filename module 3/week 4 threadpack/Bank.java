package threadpack;

class Custom {
	int balance = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw");
		if(balance<amount) {
			System.out.println("less balance, waiting for deposit");
			try {
				wait();//super class thread method get inherited
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance-=amount;
		System.out.println("withdraw completed");

	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		balance+=amount;
		System.out.println("deposited completed");
		notify();
	}
}

public class Bank {

	public static void main(String[] args) {
		Custom c=new Custom();
		
		new Thread() {//anonymous class
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {//anonymous class
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}
}
