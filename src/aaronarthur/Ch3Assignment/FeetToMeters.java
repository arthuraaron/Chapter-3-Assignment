package aaronarthur.Ch3Assignment;

import java.util.Scanner;

// Aaron Arthur 9/18 Converts feet into meters

public class FeetToMeters {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		double feet;
		double meters;
		
		// Get user input
		System.out.println("Welcome to the feet to meters calculator! ");
		
		System.out.println("Enter in an amount of feet: ");
		feet = input.nextDouble();
		
		// Do calculations
		meters = feet * 0.305;
		
		// Display output
		System.out.println("The amount of meters is: " + meters);
		
		
	}

}
