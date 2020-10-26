// Chapter 2 Exercise 8
// Created by: Branden Addicott
// Created on: 10/22/2020

//import;
import java.util.*;

public class Exercise8 {
	static Scanner console = new Scanner(System.in);
	static public void main(String[] args) {
		double num1, num2, num3, num4, num5, sum; 
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

		//Calc average;
		sum = (num1 + num2 + num3 + num4 + num5);
		
		System.out.println("The Average Score: "+(int) (Math.round(sum)));
	}
}
