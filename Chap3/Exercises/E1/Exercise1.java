//Chapter 3 Exercise 1;
//Created by: Branden Addioctt;
//Created on: 10/26/2020;


import java.util.*;
import java.io.*;

public class Exercise1 {
	static public void main(String[] args)
	throws FileNotFoundException
	{
		Scanner infile = new Scanner(new FileReader("inData.txt"));
		PrintWriter outFile = new PrintWriter("outData.dat");

		double length, width, area, parameter, radius, cirArea, circum, start, rate, end;
		String fName, lName;
		int age;
		char a,b;

		length = infile.nextDouble();
		width = infile.nextDouble();
		radius = infile.nextDouble();
		fName = infile.next();
		lName = infile.next();
		age = infile.nextInt();
		start = infile.nextDouble();
		rate = infile.nextDouble();
		a = infile.next().charAt(0);
		
		area = length * width;
		parameter = 2 * (length + width);
		cirArea = Math.PI * Math.pow(radius,2);
		circum = 2 * Math.PI * radius;
		end = start * (1 + (rate / 100));
		b = (char) (a+1);	
		
		outFile.println();
		outFile.println(String.format("Retangle:%nLength = %.2f, width = %.2f, area = %.2f, parameter = %.2f"
					,length, width, area, parameter));
		
		outFile.println();
		outFile.println(String.format("Circle:%nRadius = %.2f, area = %.2f, circumference = %.2f"
					,radius,cirArea,circum));
		
		outFile.println();
		outFile.println(String.format("Name: %s %s, age: %d",fName,lName,age));
		outFile.println(String.format("Beginning balance = $%.2f, interest rate = %.2f", start,rate));
		outFile.println(String.format("Balance at the end of the month = $%.2f",end));
		
		outFile.println();
		outFile.println(String.format("The character that comes after A in the ASCII set is %c",b));

		infile.close();
		outFile.close();
	}
}
		

