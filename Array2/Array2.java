/**
 @Author:
 Period:
 Date Started: Jan 24, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Array2 
{
	
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("n = ");
		int n = scan.nextInt();
		double a [] = new double [n];
		for(int i = 0; i < a.length; i++)
		{	
			System.out.print("Enter the next array value: ");
			a [i] = scan.nextDouble();
		}
		System.out.println("-------------------");
		for(int i = 0; i <a.length; i ++)
		{
			System.out.println(a[i]);
		}
		System.out.println("-------------------");
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		for(int i =0; i <a.length; i ++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}
