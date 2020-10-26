// Chapter 2 Exercise 11;
// Created by: Branden Addicott;
// Created on: 10/22/2020;

//import;
import java.util.*;

public class Exercise11 {
	static Scanner concole = new Scanner(System.in);
	static public void main(String[] args) {
		int sec,min,hour;
		System.out.print("Enter Elapsed Time in Seconds: ");
		sec = concole.nextInt();
		
		min = sec / 60;
		sec = sec % 60;

		hour = min / 60;
		min = min % 60;

		System.out.println(hour+":"+min+":"+sec);
	}
}

