//Chapter 3 Exercise 5;
//Created by: Branden Addicott;
//Created on: 11/5/2020;

import java.util.*;
import java.io.*;

public class Exercise5 {
	
	public static void main(String[] args)
	throws FileNotFoundException
	{
		double tickets, temp1, temp2, sale;
		tickets = temp1 = temp2 = sale = 0;
		Scanner inFile = new Scanner(new FileReader("file.in"));
		
		for ( int i = 1; i <=4; i++){
		temp1 = inFile.nextInt();
		temp2 = inFile.nextInt();
		
		sale += (temp1 * temp2);
		tickets += temp2;
		}

		System.out.print(String.format("Total Tickets Sold: %.0f %n",tickets));
		System.out.print(String.format("Total Sale Amount: $%.2f %n",sale));
	}
}
