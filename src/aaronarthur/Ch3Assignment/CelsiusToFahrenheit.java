package aaronarthur.Ch3Assignment;

import java.util.Scanner;
// Aaron Arthur 9/18 Converts celsius to fahrenheit

public class CelsiusToFahrenheit {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// User input
		System.out.println("What is the temperature in Celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit;
		
		// Do calculations
		fahrenheit = (9/5) * celsius + 32;
		
		// Display results
		System.out.println("The temperature in fahrenheit is: " + fahrenheit);
		
	}

}
