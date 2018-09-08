/**
 @Author:
 Period:
 Date Started: Jan 23, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Array1 
{
	
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("n = ");
		int n = scan.nextInt();
		double a [] = new double [n];
		double sum = 0; 
		for(int i = 0; i < a.length; i++)
		{	
			System.out.print("Enter the next array value: ");
			a [i] = scan.nextInt();
			sum += a[i];
		}
		System.out.println("-------------------");
		for(int i = 0; i <a.length; i ++)
		{
			System.out.println((int)a[i]);
		}
		System.out.println("-------------------");
		double average = (double)sum/a.length;
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
}
