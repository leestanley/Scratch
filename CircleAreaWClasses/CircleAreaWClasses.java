
/**
 @Author:
 Period:
 Date Started: Aug 31, 2016
 Date Completed:
 Assignment #:
 Description:
*/
//import apcslib.*;   //Includes the Format class.
//import chn.util.*;  //Includes ConsoleIO class.
import java.util.*; // includes Scanner IO

public class CircleAreaWClasses 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		
		MyCircle circle = new MyCircle();
		String name;
		int radius;
		double area;
					
		System.out.print("What is your name? 3
		");
		name = scan.next();
		System.out.println("Good morning, " + name);
		System.out.println();
		for (int loop = 1 ; loop <= 5; loop++)    
		{		
			  System.out.print("Enter your radius:");
			  radius = scan.nextInt();
			  area = circle.findArea(radius);
			  System.out.println("radius =" + radius);
			  System.out.println("area =" + area);
		}
		System.out.println("Bye, " + name + " and have a nice day!");
	}
}
