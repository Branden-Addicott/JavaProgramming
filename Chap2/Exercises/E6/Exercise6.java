// Chapter 2 Exercise 6
// Created by: Branden Addicott
// Created on: 10/22/2020

//import;

import java.util.*;

public class Exercise6 {
	
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		double num1;
		System.out.print("Enter decimal number: ");
		num1 = Math.round(console.nextDouble());
		System.out.println("Rounded value = "+(int) (num1));
	}
}

