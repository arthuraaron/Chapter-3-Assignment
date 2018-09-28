package aaronarthur.Ch3Assignment;

import java.util.Scanner;

// Aaron Arthur 9/18 Converts pounds to kilograms

public class PoundsToKilograms {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		double pounds;
		double kilograms;
		
		// Get user input
		System.out.println("Welcome to the pounds to kilograms converter!");
		
		System.out.println("Enter the amount of pounds you have: ");
		pounds = input.nextDouble();
		
		// Do calculations
		kilograms = pounds * 0.454;
		
		// Display output
		System.out.println("The amount of kilograms is: "+ kilograms);
		
	}

}
