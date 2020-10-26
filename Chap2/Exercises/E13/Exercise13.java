// Chapter 2 Exercise 13;
// Created by: Branden Addicott;
// Created on: 10/23/2020;

//import;

import java.util.*;

public class Exercise13 {
	static Scanner console = new Scanner(System.in);

	static public void main(String[] args) {
		// Initalize variables;
		double price,mark,tax,out;

		//Use Scanner Object to set variables;
		System.out.print("Enter Item Price: ");
		price = console.nextDouble();

		System.out.print("Enter Item Mark-up Percent: ");
		mark = console.nextDouble();

		System.out.print("Enter Sales Tax Percent: ");
		tax = console.nextDouble();

		//Calculate Final Price;
		out =  (price*(1+(mark/100))) * (1+(tax/100));

		//Print Entered variables;
		System.out.println("Price: $"+price);
		System.out.println("Mark-up: "+mark+"%");
		System.out.println("Sales Tax: "+tax+"%");
		System.out.println("Final Price: $"+out);
	}
}
