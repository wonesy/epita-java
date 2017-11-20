package fr.epita.bank.datamodel;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Account {

	protected int id;
	protected double balance;
	private static final AtomicInteger count = new AtomicInteger(0);
	
	public Account(double balance) {
		this.id = count.incrementAndGet();
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
