package fr.epita.bank.utils;

import java.util.Scanner;

public class ConsoleHandler {

	public static Double getDouble(Scanner scanner) {
		Double val;
		int attemptsRemaining;
		
		attemptsRemaining = 3;
		while (attemptsRemaining > 0) {
			try {
				val = Double.valueOf(scanner.nextLine());
				return val;
			} catch (NumberFormatException nbe) {
				attemptsRemaining--;
				System.out.println("Invalid value, please try again (" + attemptsRemaining + " attempts remaining):");
			}
		}
		
		return -1d;
	}
}
