//Chapter 2 Exercise 18;
//Created by: Branden Addicott;
//Created on: 10/23/2020;

//Import;
import java.util.*;

public class Exercise18 {
	static Scanner console = new Scanner(System.in);
	static public void main(String[] args) {
		int length,width,hight,doorWidth,doorHight,windWidth1,windWidth2,windHight1,windHight2;
		double carpet, paint;

		System.out.print("Enter Width of Room: ");
		width = console.nextInt();
		System.out.print("Enter length of Room: ");
		length = console.nextInt();
		System.out.print("Enter hight of Room: ");
		hight = console.nextInt();
		System.out.print("Enter the door width: ");
		doorWidth = console.nextInt();
		System.out.print("Enter the door hight: ");
		doorHight = console.nextInt();
		System.out.print("Enter window 1 width: "); 
		windWidth1 = console.nextInt();
		System.out.print("Enter window 2 width: "); 
		windWidth2 = console.nextInt();
		System.out.print("Enter window 1 hight: "); 
		windHight1 = console.nextInt();
		System.out.print("Enter window 2 hight: "); 
		windHight2 = console.nextInt();
		System.out.print("Enter shelf width: "); 
		int shelfWidth = console.nextInt();
		System.out.print("Enter shelf hight "); 
		int shelfHight = console.nextInt();
		System.out.print("Enter cost of carpet: ");
		carpet = console.nextDouble();
		System.out.print("Enter cost of paint: ");
		paint = console.nextDouble();

		int floor = length * width;

		int wall = 2 * (length * hight) + 2 * (width * hight);

		wall -= (windWidth1 * windHight1 + windWidth2 * windHight2);
		wall -= (doorWidth * doorHight + shelfWidth * shelfHight);

		System.out.println("Cost of carpet: $"+(floor * carpet));
		//This assumes we are also painting the ceiling;
		System.out.println("Cost of paint: $"+(wall * paint + floor * paint));
		System.out.println("Total cost: $"+(floor*carpet + wall*paint));
	}
}
