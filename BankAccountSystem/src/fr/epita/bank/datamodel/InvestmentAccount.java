package fr.epita.bank.datamodel;

public class InvestmentAccount extends Account {
	public InvestmentAccount(double balance) {
		super(balance);
	}

	@Override
	public String toString() {
		return "InvestmentAccount [balance=" + balance + ", getBalance()=" + getBalance() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
