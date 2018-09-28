package aaronarthur.Ch3Assignment;

import java.util.Scanner;

// Aaron Arthur 9/18 Calculates the volume of a cylinder

public class VolumeOfCylinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		double radius;
		double length;
		double area;
		double volume;
		final double PI = 3.141592;
		
		// Get user input
		System.out.println("Welcome to the volume calculator for cylinders!");
		
		System.out.println("Enter the radius of your cylinder: ");
		radius = input.nextDouble();
		
		System.out.println("Enter the length of your cylinder: ");
		length = input.nextDouble();
		
		// Do calculations
		area = radius * radius * PI;
		volume = area * length;
		
		// Display results
		System.out.println("Your cylinder has a volume of : "+ volume);
		

	}

}
