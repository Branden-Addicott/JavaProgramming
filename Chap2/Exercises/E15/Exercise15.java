// Chapter 2 Exercise 15;
// Created by: Branden Addicott;
// Created on: 10/23/2020;

//import
import java.util.*;

public class Exercise15 {
	static Scanner console = new Scanner(System.in);
	//Set Fixed variables;
	static final double CARTON = 3.78;

	static public void main(String[] args) {
		double milk,totalCost,totalProfit,cost,profit;
		int totalCarton;
		
		//Set Milk Production;
		System.out.print("Enter Milk Production: ");
		milk = console.nextDouble();
		System.out.print("Enter Cost of Production: ");
		cost = console.nextDouble();
		System.out.print("Enter Profit per Carton: ");
		profit = console.nextDouble();
		
		//Calculations;
		totalCarton = (int) (Math.round(milk/CARTON));
		totalCost = cost * totalCarton;
		totalProfit = profit * totalCarton;

		//Print;
		System.out.println("Cartons Produced: "+totalCarton);
		System.out.println("Total Cost: $"+totalCost);
		System.out.println("Total Profit: $"+totalProfit);
	}
}
