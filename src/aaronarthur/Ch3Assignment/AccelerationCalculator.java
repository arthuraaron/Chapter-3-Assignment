package aaronarthur.Ch3Assignment;

import java.util.Scanner;

// Aaron Arthur 9/18 Calculates Acceleration

public class AccelerationCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		double velocity1;
		double velocity2;
		double time;
		double acceleration;
		
		// Get user input
		System.out.println("Welcome to the acceleration calculator!");
		
		System.out.println("Enter the starting velocity: ");
		velocity1 = input.nextDouble();
		
		System.out.println("Enter the final velocity: ");
		velocity2 = input.nextDouble();
		
		System.out.println("Enter the time taken: ");
		time = input.nextDouble();
		
		// Do calculations
		acceleration = (velocity2 - velocity1) / time;
		
		// Display output
		System.out.println("The average velocity is: "+ acceleration + " m/s^2");
		
		
	}

}
