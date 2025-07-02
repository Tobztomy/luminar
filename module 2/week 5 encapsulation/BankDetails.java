package encapsulation;

class Bank {
	private double balance;

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		}
	}

	public double getBalance() {
		return balance;
	}

}

public class BankDetails {

	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.deposit(10000.00);
		System.out.println(bank.getBalance());
		bank.withdraw(500.00);
		System.out.println(bank.getBalance());
	}

}
