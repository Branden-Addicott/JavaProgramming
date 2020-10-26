// Chapter 2 Excercise 4
// Created by: Branden Addicott
// Created on: 10/22/2020

//import classes
import java.util.*;

public class Exercise4 {
	static Scanner console = new Scanner(System.in);
	static final int SECRET = 11;
	static final double RATE = 12.50; 
	public static void main(String[] args) {
		//Declare and Initialize Variables
		int num1, num2, num3, newNum;
		num1 = num2 = num3 = newNum = 11;
		String name;
		double hoursWorked, wages;
		System.out.print("Please enter two integers separated by space, then press Enter: ");
		num1 = console.nextInt();
		num2 = console.nextInt();
		// Output num1 and num2;
		System.out.print("The value of num1 = "+num1);
		System.out.println(" and the value of num2 = "+num2);
		// Calculate newNum;
		newNum = (num1 * 2) + num2;
		//Output newNum;
		System.out.println("The value of newNum = "+newNum);
		// Update newNum;
		newNum += SECRET;
		//Output newNum;
		System.out.println("The updated value of newNum = "+newNum);
		//Prompt for last name;
		System.out.print("Enter last Name: ");
		name = console.next();
		//Prompt for Hours Worked;
		System.out.print("Enter a Decimal of Hours Worked (0 - 70): ");
		hoursWorked = console.nextDouble();
		//Calculate Wage;
		wages = hoursWorked * RATE;
		System.out.println("Name: "+name);
		System.out.println("Pay Rate: $"+RATE);
		System.out.println("Hours Worked: "+hoursWorked);
		System.out.println("Salary: $"+wages);
	}
}

