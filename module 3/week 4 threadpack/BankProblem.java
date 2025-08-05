package threadpack;

class BankAccount {
	int balance = 1000;

	public void withdraw(String user, int amount) {
		if (balance >= amount) {
			System.out.println(user + " withdraw Rs. " + amount);
			try {
				Thread.sleep(500);
				balance -= amount;
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		} else {
			System.out.println(user+" insufficient balance");
		}
	}
}

class ATMThread extends Thread {
	BankAccount account; // reference(object)
	String name;
	int amount;

	ATMThread(BankAccount account, String name, int amount) {
		this.account=account;
		this.name=name;
		this.amount=amount;
	}

	public void run() {
		account.withdraw(name, amount);
	}
}

public class BankProblem {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		ATMThread atmOne = new ATMThread(bank, "manu", 1000);
		ATMThread atmTwo = new ATMThread(bank, "John",2000);
		atmOne.start();
		atmTwo.start();
	}

}
