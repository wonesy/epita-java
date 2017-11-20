package fr.epita.bank.datamodel;

public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.setInterestRate(interestRate);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", balance=" + balance + ", getInterestRate()="
				+ getInterestRate() + ", getBalance()=" + getBalance() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}	
}
