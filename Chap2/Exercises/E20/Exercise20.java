//Chapter 2 Exercise 20;
//Created by: Branden Addicott;
//Created on: 10/23/2020;

//import;
import java.util.*;

public class Exercise20 {
	static Scanner console = new Scanner(System.in);
	static final double FEE = 0.015;
	static public void main(String[] args) {
		System.out.print("Enter purchase price of stock: $");
		double start = console.nextDouble();
		System.out.print("Enter number of stocks sold: ");
		int sold = console.nextInt();
		System.out.print("Enter sale price: $");
		double end = console.nextDouble();

		double cost = sold * start * (1 + FEE);
		double revenue = sold * end * (1 - FEE);
		double profit = revenue - cost;

		System.out.println("Total Profit: $"+profit);
	}
}
