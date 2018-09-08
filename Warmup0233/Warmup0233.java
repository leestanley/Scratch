/**
 @Author:
 Period:
 Date Started: Feb 23, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup0233 
{
	public static int min(int [] a, int start)
	{
		if (start == a.length - 1) 
		{
			return a[start];
		}
  		int val = min(a, start + 1);
		if (a[start] < val)
		{
		    return a[start];		
		}
  		else
  		{
   			 return val;
  		}
	}

	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How big is your array? ");
		int size = scan.nextInt();
		int [] a = new int [size];
		for(int i = 0; i < a.length; i++)
		{
			System.out.print("Enter the next array value: ");
			a[i] = scan.nextInt();
		}
		System.out.println("The minimum value in array a is " + min(a, 0));
	}
}
