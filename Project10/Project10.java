/**
 @Author:
 Period:
 Date Started: Nov 10, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util*;

public class Assignment10
{
	public static void main(String args[]) 
	{
		String a = "";
		String b = "";
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter String: " );
		a = scnr.next();
		System.out.println("Enter String B: ");
		b = scnr.next();
		System.out.println(a + " " + a.length());
		System.out.println(b + " " + b.length());
		for (int k = 0; k<=a.length(); k++)
		{
			for(int c = k; c<= a.length(); c++)
			{
				System.out.println(a.substring(k,c));	
			}
	
		}
		if (a.equals(b)){
			System.out.println("Equals");
		}
		else if (a.compareTo(b)<0) {
			System.out.println("not equals");
			System.out.println(a + " " + b);
		}
		else{
	System.out.println(“not equals”);		
System.out.println(b + " " + a);
				}
				System.out.println(a.indexOf(b));
	}
}




