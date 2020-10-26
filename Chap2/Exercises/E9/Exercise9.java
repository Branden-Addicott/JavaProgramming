// Chapter 2 Exercise 9
// Created by: Branden Addicott
// Created on: 10/22/2020

//import;
import java.util.*;

public class Exercise9 {
	static Scanner console = new Scanner(System.in);
	static public void main(String[] args) {
		double num1, num2, num3, num4, num5; 
		int num1a, num2a, num3a, num4a, num5a; 
		System.out.println("This Program will ask for 5 decimal numbers");
		
		System.out.print("Enter 1st number: ");
		num1 = console.nextDouble();
		System.out.print("Enter 2nd number: ");
		num2 = console.nextDouble();
		System.out.print("Enter 3rd number: ");
		num3 = console.nextDouble();
		System.out.print("Enter 4th number: ");
		num4 = console.nextDouble();
		System.out.print("Enter 5th number: ");
		num5 = console.nextDouble();

		//print entries;
		System.out.println("Number 1: "+num1);
		System.out.println("Number 2: "+num2);
		System.out.println("Number 3: "+num3);
		System.out.println("Number 4: "+num4);
		System.out.println("Number 5: "+num5);

		//Calc average;
		num1a = (int) (Math.round(num1));
		num2a = (int) (Math.round(num2));
		num3a = (int) (Math.round(num3));
		num4a = (int) (Math.round(num4));
		num5a = (int) (Math.round(num5));
		
		System.out.println("Sum of Scores: "+(num1a + num2a + num3a + num4a + num5a)); 
		System.out.println("The Average Score: "+((num1a + num2a + num3a + num4a + num5a)/5)); 
	}
}
