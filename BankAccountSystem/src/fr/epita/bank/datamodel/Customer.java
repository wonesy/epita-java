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

	public void addNewSavingsAccount(double balance, double interestRate) {
		this.savingsAccounts.add(new SavingsAccount(balance, interestRate));
	}
	
	public void addNewInvestmentAccount() {
		this.investmentAccounts.add(new InvestmentAccount(0d));
	}
	
	@Override
	public String toString() {
		return "Customer\n\t[name=" + name + "\n\taddress=" + address + "\n\tsavingsAccounts=" + savingsAccounts
				+ "\n\tinvestmentAccounts=" + investmentAccounts + "\n\tgetName()=" + getName() + "\n\tgetAddress()="
				+ getAddress() + "\n\tgetClass()=" + getClass() + "\n\thashCode()=" + hashCode() + "\n\ttoString()="
				+ super.toString() + "]";
	}
}
