package aaronarthur.Ch3Assignment;

import java.util.Scanner;

// Aaron Arthur 9/18 Calculates energy needed to heat water from one temperature to another

public class EnergyCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		double waterAmount;
		double temperature0;
		double temperature1;
		double energy;
		
		// Get user input
		System.out.println("Welcome to the energy calculator! ");
		
		System.out.println("Enter the amount of water in kilograms: ");
		waterAmount = input.nextDouble();
		
		System.out.println("Enter the initial temperature in celsius: ");
		temperature0 = input.nextDouble();
		
		System.out.println("Enter the final temperature in celsius: ");
		temperature1 = input.nextDouble();
		
		// Do calculations			
		energy = waterAmount * (temperature1 - temperature0) * 4184;
		
		// Display output
		System.out.println("It will take " + energy + " joules to heat up the water. ");

	}

}
