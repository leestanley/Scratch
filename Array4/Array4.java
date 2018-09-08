/**
 @Author:
 Period:
 Date Started: Jan 31, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Array4 
{
	
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("n = ");
		int n = scan.nextInt();
		int a [] = new int [n];
		for(int i = 0; i < a.length; i++)
		{	
			System.out.print("Enter the next array value: ");
			a [i] = scan.nextInt();
		}
		System.out.println("-------------------");
		for(int i = 0; i <a.length; i ++)
		{
			System.out.println(a[i]);
		}
		System.out.println("-------------------");
		System.out.print("Choose position to insert: ");
		int x = scan.nextInt();
		while(x < 0 || x >= a.length)
		{
			System.out.print("Out of bounds choose again: ");
			x = scan.nextInt();

		}
		int last = a[a.length -1];
		for(int i = a.length -1; i >= x; i--)
		{
			int p = a[i - 1]; 
			a[i] = p;
		}
		a[x] = last;
		System.out.println("-------------------");
		for(int i = 0; i <a.length; i ++)
		{
			System.out.println(a[i]);
		}
	}
}
