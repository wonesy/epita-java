package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starting this bank shit...");
		
		Customer customer1 = new Customer("Cameron", "Paris, France");
		
		customer1.addNewSavingsAccount(0.2);
		
		System.out.println(customer1);
	}

}
