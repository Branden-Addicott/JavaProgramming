//Chapter 2 Exercise 19;
//Created by: Branden Addicott;
//Created on: 10/23/2020;

//import;
import java.util.*;

public class Exercise19 {
	static Scanner console = new Scanner(System.in);
	static public void main(String[] agrs) {
		System.out.print("Pounds in a bag: ");
		double bag = console.nextDouble();

		double bags = 2204.62262 / bag;

		System.out.println("Number of Bags for a Metric Ton: "+bags);
	}
}
