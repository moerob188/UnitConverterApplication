package main;

import java.util.Scanner;
public class Converter {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int option;	// will be used to allow user to enter the option they want 
		double input; // will be used to get the value the user is trying to convert 
		double result; // will be used to store the result of the conversion 
		
		do {
			System.out.println("Please enter the number that corresponds to the option you would like");
			System.out.println("1. Inches to Feet");
			System.out.println("2. Feet to Yards");
			System.out.println("3. Yards to Miles");
			System.out.println("4. Quit");

			option = scanner.nextInt();
			
			switch(option) {
			
			case 1:
			System.out.println("Enter in a number of Inches");
			input = scanner.nextDouble();
			result = input / 12;
			System.out.println(input + "in = " + result + "ft.");
			break;
			
			case 2:
			System.out.println("Enter in a number of Feet");
			input = scanner.nextDouble();
			result = input / 3;
			System.out.println(input + "ft = " + result + "yd.");
			break;
			
			case 3:
			System.out.println("Enter in a number of Yards");
			input = scanner.nextDouble();
			result = input / 1760;
			System.out.println(input + "yd = " + result + "mi.");	
			break;
			
			case 4:
			break;
			
			default:
				System.out.println("You entered in an invalid response please only type a digit 1 - 4.");
				break;
			}
			
		}while(option != 4);
	}

}
