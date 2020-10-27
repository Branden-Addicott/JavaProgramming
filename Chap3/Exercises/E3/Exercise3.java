//Chapter 3 Exercise 3;
//Created by: Branden Addicott;
//Created on: 10/27/2020;

import java.util.*;

public class Exercise3 {
        static Scanner console = new Scanner(System.in);
	static final double RATIO =2.2;

	public static void main(String[] args) {
		double kg, lbs; 
		
		System.out.print("Enter weight in kilograms: ");
		kg = console.nextDouble();

		lbs = kg * RATIO;

		System.out.println();
		System.out.println(String.format("The person's weight in kilograms is: %.2f", kg));
		System.out.println(String.format("The person's weight in pounds is: %.2f", lbs));
	}
}
