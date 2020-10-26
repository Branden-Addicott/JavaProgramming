//Chapter 2 Exercise 16;
//Created by: Branden Addicott;
//Created on: 10/23/2020;

//import;
import java.util.*;

public class Exercise16 {
	static Scanner console = new Scanner(System.in);
	static final double RATE = 15.50;
	static final double TAXPCT = 0.14;
	static final double NEWPCT = 0.1;
	static final double SUPPLIESPCT = 0.01;
	static final double BONDPCT = 0.25;
	static final double PARENTPCT = 0.5;
	static public void main(String[] args) {
		double payRate,hours,preTax,postTax,clothes,supplies,bonds,parents,rmd;

		System.out.print("Enter Payment Per Hour: ");
		payRate = console.nextDouble();

		System.out.print("Enter Hours Worked: ");
		hours = console.nextDouble();

		//Calculations;
		preTax = payRate * hours;
		postTax = rmd = (preTax * (1 - TAXPCT));
		clothes = rmd * NEWPCT;
		supplies = rmd * SUPPLIESPCT;

		rmd -= (clothes + supplies);

		bonds = rmd * BONDPCT;
		parents = bonds * PARENTPCT;
		
		//Print;
		System.out.println("Pre-tax Income: $"+preTax);
		System.out.println("Post-tax Income: $"+postTax);
		System.out.println("Clothes & Accessory Cost: $"+clothes);
		System.out.println("Supply Cost: $"+supplies);
		System.out.println("Savings Bond: $"+bonds);
		System.out.println("Parent's Bond Gift: $"+parents);
	}
}

