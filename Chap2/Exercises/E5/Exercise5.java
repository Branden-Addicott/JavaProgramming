// Chapter 2 Exercise 5
// Created by: Branden Addicott
// Created on: 10/22/2020

// import classes;
import java.util.*;

public class Exercise5 {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		int width;
		int length;
		int area;
		int perimeter;
		

		System.out.print("Enter the width: ");
		width = console.nextInt();
		System.out.println();
		System.out.print("Enter the length: ");
		length = console.nextInt();

		System.out.println();
		area = width * length;
		perimeter = 2 * (length + width);

		System.out.println("Area = "+area);
		System.out.println("Perimeter = "+perimeter);
	}
}
