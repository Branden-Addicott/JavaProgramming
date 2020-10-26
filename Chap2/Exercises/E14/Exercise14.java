// Chapter 2 Exercise 14;
// Created by: Branden Addicott;
// Created on: 10/23/2020;

//import
import java.util.*;

public class Exercise14 {
	static Scanner console = new Scanner(System.in);
	//Set Fixed variables;
	static final double CARTON = 3.78;
	static final double COST = 0.38;
	static final double PROFIT = 0.27;

	static public void main(String[] args) {
		double milk,totalCost,totalProfit;
		int totalCarton;
		
		//Set Milk Production;
		System.out.print("Enter Milk Production: ");
		milk = console.nextDouble();

		//Calculations;
		totalCarton = (int) (Math.round(milk/CARTON));
		totalCost = COST * totalCarton;
		totalProfit = PROFIT * totalCarton;

		//Print;
		System.out.println("Cartons Produced: "+totalCarton);
		System.out.println("Total Cost: $"+totalCost);
		System.out.println("Total Profit: $"+totalProfit);
	}
}
