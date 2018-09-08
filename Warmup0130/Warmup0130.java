/**
 @Author:
 Period:
 Date Started: Jan 30, 2017
 Date Completed:
 Assignment #:
 Description:
*/

import java.util.*;

public class Warmup0130 
{
	public static boolean sequentialSearch(int [] a, int search) // note that a is defined with []
	{
		// insert code to return true if search is in a, false if search is not in a
		
		
		
		int i = 0;
		while(i <= a.length)
		{
			if((int)a[i] == search)
			{
				return true;
			}
			i++;
		}
		return false;






	}
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How big is your array? ");
		int size = scan.nextInt();
		int [] arr = new int [size];
		for(int index = 0; index < arr.length; index++)
		{
			System.out.print("Next array value = ");
			arr[index] = scan.nextInt();
		}
		System.out.print("What is your search value? ");
		int search = scan.nextInt();
		System.out.println(sequentialSearch(arr, search)); // note that arr is passed without []
	}
}

