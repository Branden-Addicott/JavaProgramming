// Chapter 3 Exercise 8;
// Created by: Branden Addicott;
// Created on: 11/16/2020;

import java.io.*;
import java.util.*;

public class Exercise8 {
	public static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter Mass in Grams: ");
		double mass = console.nextDouble();
		
		System.out.print("Enter Density: ");
		double density = console.nextDouble();

		System.out.println(String.format("Volume equals %.2f", mass / density));
	}
}
