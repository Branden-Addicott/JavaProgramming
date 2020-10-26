//Chapter 2 Exercise 17;
//Created by: Branden Addicott;
//Created on: 10/23/2020;

//Import;
import java.util.*;

public class Exercise17 {
	static Scanner console = new Scanner(System.in);
	static public void main(String[] args) {
		String a,b,c;

		System.out.print("Enter String #1: ");
		a = console.nextLine();

		System.out.print("Enter String #2: ");
		b = console.nextLine();

		System.out.print("Enter String #3: ");
		c = console.nextLine();

		//print;
		
		System.out.println();
		System.out.println(a+" "+b+" "+c);
		System.out.println(a+" "+c+" "+b);
		System.out.println(c+" "+a+" "+b);
		System.out.println(c+" "+b+" "+a);
		System.out.println(b+" "+c+" "+a);
		System.out.println(b+" "+a+" "+c);
	}
}
