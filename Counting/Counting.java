/**
 @Author:
 Period:
 Date Started: Oct 20, 2016
 Date Completed:
 Assignment #:
 Description:
*/
//import apcslib.*;
//import chn.util.*;
import java.util.*;

public class Counting 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("n = ");
		int n = scan.nextInt();
		System.out.print("m = ");
		int m = scan.nextInt();
		int max = 0; int min = 0;
		if(n < m) {
				min = n;
				max = m;}
		else {
				min = m;
				max = n;}	
		System.out.println("Sum: " + (n+m) );
		System.out.println("Difference: " + (n-m) );
		System.out.println("Product: " + (n*m) );
		System.out.println("Quotient: " + (n / m) );
		System.out.println("Remainder: " + (n % m) );
		System.out.println("Average: " + ((float) (n+m)/2) );
		System.out.println("Distance: " + Math.abs(n-m) );
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}
}
