package fr.epita.bank.launcher;

import java.util.Scanner;

import fr.epita.bank.datamodel.*;
import fr.epita.bank.utils.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Starting this bank shit...");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the user's name:");
		String name = scanner.nextLine();
		
		System.out.println("What is the user's address:");
		String address = scanner.nextLine();
		
		System.out.println("Enter the savings account interest rate:");
		double ir = ConsoleHandler.getDouble(scanner);
		
		System.out.println("And the starting balance:");
		double bal = ConsoleHandler.getDouble(scanner);
		
		Customer customer1 = new Customer(name, address);
		customer1.addNewSavingsAccount(bal, ir);
		
		System.out.println(customer1);
		
		scanner.close();
	}
}
