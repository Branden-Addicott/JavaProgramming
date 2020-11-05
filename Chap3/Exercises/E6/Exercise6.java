// Chapter 3 Exercise 6;
// Created by: Branden Addicott;
// Created on: 11/05/2020;

import java.util.*;
import java.io.*;

public class Exercise6 {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter outFile = new PrintWriter("prog.out");
		
		double gross,fed,state,ss,med,pen,health,net;
		
		System.out.print("Enter Employee Name: ");
		String name = console.nextLine();
		
		System.out.print("Enter Gross Amount: ");
		double amount = console.nextDouble();
		
		gross = amount;

		fed = amount * 0.15;
		state = amount * 0.035;
		ss = amount * 0.0575;
		med = amount * 0.0275;
		pen = amount * 0.05;
		health = 75;

		net = amount - fed - state - ss - med -pen - health;

		
		outFile.println(name);
		outFile.println(String.format("Gross Amount:          $%8.2f",gross));
		outFile.println(String.format("Federal Tax:           $%8.2f",fed));
		outFile.println(String.format("State Tax:             $%8.2f",state));
		outFile.println(String.format("Social Security Tax:   $%8.2f",ss));
		outFile.println(String.format("Medicare/Medicaid Tax: $%8.2f",med));
		outFile.println(String.format("Pension Plan:          $%8.2f",pen));
		outFile.println(String.format("Health Insurance:      $%8.2f",health));
		outFile.println(String.format("Net Pay:               $%8.2f",net));
	
		outFile.close();
	}
}	
