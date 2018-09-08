/**
 @Author:
 Period:
 Date Started: Jan 25, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Array3 
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
		System.out.print("Choose position to swap: ");
		int x = scan.nextInt();
		while(x < 0 || x >= a.length)
		{
			System.out.print("Out of bounds choose again: ");
			x = scan.nextInt();

		}
		System.out.print("Choose 2nd position to swap: ");
		int y = scan.nextInt();
		while(y < 0 || y >= a.length)
		{
			System.out.print("Out of bounds choose again: ");
			y = scan.nextInt();
		}
		int temp = (int)a[x];
		a[x] = a[y];
		a[y] = temp;
		System.out.println("-------------------");
		for(int i = 0; i <a.length; i ++)
		{
			System.out.println(a[i]);
		}
		System.out.println("-------------------");
	}
}
