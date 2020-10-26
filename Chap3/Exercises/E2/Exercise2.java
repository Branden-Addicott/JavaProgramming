//Chapter 3 Exercise 2;
//Created by: Branden Addicott;
//Created on: 10/26/2020;

import java.util.*;

public class Exercise2 {

	static Scanner console = new Scanner(System.in);
	static final double PI = 3.14159;

	static public void main(String[] args) {
		
		double hight,radius;

		System.out.print("Enter the height of the cylinder: ");
		hight = console.nextDouble();
		System.out.println();

		System.out.print("Enter the radius of the base of the " 
				+ "cylinder: ");
		radius = console.nextDouble();
		System.out.println();

		System.out.println(String.format("Volume of the cylinder = %.2f",
					PI * Math.pow(radius,2) * hight));
		
		System.out.println(String.format("Surface area: %.2f",
					2 * PI * Math.pow(radius,2) 
					+ 2 * PI * radius * hight));
	}
}
