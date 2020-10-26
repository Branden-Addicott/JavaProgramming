// Chapter 2 Exercise 12;
// Created by: Branden Addicott;
// Created on: 10/22/2020;

// Import;
import java.util.*;

public class Exercise12 {
	static Scanner concole = new Scanner(System.in);
	static public void main(String[] args) {
		int hour,min,sec, total;

		System.out.print("Enter Hours: ");
		hour = concole.nextInt();
		
		System.out.print("Enter Minutes: ");
		min = concole.nextInt();
		
		System.out.print("Enter Seconds: ");
		sec = concole.nextInt();

		total = hour * 3600 + min * 60 + sec;

		System.out.println("Total Elapsed Time in Seconds: "+total);
	}
}
