package fr.epita.bank.datamodel;

public abstract class Account {

	protected double balance;
	
	public Account(double balance) {
		this.setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", getBalance()=" + getBalance() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
