//Chapter 3 Exercise 4;
//Created by: Branden Addicott;
//Created on: 10/27/2020;

import java.util.*;

public class Ch3_PrExercise4 
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
		double cost,area,bagSize;

		System.out.print("Enter the amount of fertilizer, "
				+ "in pounds, in one bag: ");
		bagSize = console.nextDouble();
		System.out.println();

		System.out.print("Enter the cost of the " + bagSize
				+ " pound fertilizer bag: ");
		cost = console.nextDouble();
		System.out.println();

		System.out.print("Enter the area, in square feet, that "
				+ "can be fertilized by one bag: ");
		area = console.nextDouble();
		System.out.println();

		System.out.printf("The cost of the fertilizer per pound is: "
				+ "$%.2f%n", cost / bagSize);
		System.out.printf("The cost of the fertilizer per square "
				+ "foot is: %.4f%n", cost / area);
	}
}
