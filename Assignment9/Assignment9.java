/**
 @Author:
 Period:
 Date Started: Nov 07, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Assignment9 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: " );
		String a = scan.next();
		System.out.println("Enter String B: ");
		String b = scan.next();
		System.out.println(a + " " + a.length());
		System.out.println(b + " " + b.length());
		for (int i = 0; i<=a.length(); i++)
		{
			for(int c = i; c<= a.length(); c++)
			{
				System.out.println(a.substring(i,c));	
			}
		}
		if (a.equals(b))
		{
			System.out.println("Equals");
		}
		else if (a.compareTo(b)<0) {	
			System.out.println("not equals");
			System.out.println(a + " " + b);
		}
		else
		{
			System.out.println("not equals");		
			System.out.println(b + " " + a);
		}
		System.out.println(a.indexOf(b));
	}
}
