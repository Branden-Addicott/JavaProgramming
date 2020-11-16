// Chapter 3 Exercise 7;
// Created by: Branden Addicott;
// Created on: 11/05/2020;

import java.io.*;
import java.util.*;

public class Exercise7 {

	public static void main(String[] args) 
		throws FileNotFoundException {
		
		Scanner inFile = new Scanner (new FileReader("Ch3_Ex7Data.txt"));
		PrintWriter outFile = new PrintWriter("Ch3_Ex7Output.dat");

		String firstName, lastName;
		double currSalary, percent, updatedSalary;
		
		for(int i=1; i<4; i++){
		lastName = inFile.next();
		firstName = inFile.next();
		currSalary = inFile.nextDouble();
		percent = inFile.nextDouble() / 100;

		updatedSalary = currSalary * (1 + percent);

		outFile.println(String.format(firstName+" "+lastName+" %.2f",updatedSalary));
		}
		inFile.close();
		outFile.close();
	}
}
