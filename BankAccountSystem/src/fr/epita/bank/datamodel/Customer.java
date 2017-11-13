package fr.epita.bank.datamodel;
import  java.util.ArrayList;

public class Customer {

	private String name;
	private String address;
	private ArrayList<SavingsAccount> savingsAccounts;
	private ArrayList<InvestmentAccount> investmentAccounts;
	
	public Customer(String name, String address) {
		this.setName(name);
		this.setAddress(address);
		
		this.savingsAccounts = new ArrayList<SavingsAccount>();
		this.investmentAccounts = new ArrayList<InvestmentAccount>();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address != null) {
			this.address = address;
		}
	}

	public void addNewSavingsAccount(double interestRate) {
		this.savingsAccounts.add(new SavingsAccount(0, interestRate));
	}
	
	public void addNewInvestmentAccount(double balance) {
		this.investmentAccounts.add(new InvestmentAccount(balance));
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", savingsAccounts=" + savingsAccounts
				+ ", investmentAccounts=" + investmentAccounts + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
