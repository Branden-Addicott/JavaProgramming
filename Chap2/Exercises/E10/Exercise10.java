// Chapter 2 Exercise 10;
// Created by: Branden Addicott;
// Created on: 10/22/2020;

//import

import java.util.*;

public class Exercise10 {
	static Scanner concole = new Scanner(System.in);
	public static void main(String[] args) {
		double fuel,mpg,range;

		System.out.print("Enter Fuel Capacity: ");
		fuel = concole.nextDouble();

		System.out.print("Enter Avg MPG: ");
	      	mpg = concole.nextDouble();

		System.out.println("Range = "+(int) (Math.round(fuel * mpg)));
	}
}	
