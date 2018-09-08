/**
 @Author:
 Period:
 Date Started: Dec 08, 2016
 Date Completed:
 Assignment #:
 Description:
*/

import java.util.*;

public class Warmup1208 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = scan.nextLine();
		System.out.println("Enter a String:");
		String b = scan.nextLine();
		for (int index = s.indexOf(b); index >= 0; index = s.indexOf(b, index + 1))
		{
			    		System.out.println(index);
		}
	}
}
