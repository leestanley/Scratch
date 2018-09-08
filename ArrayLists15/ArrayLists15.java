/**
 @Author:
 Period:
 Date Started: Mar 29, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class ArrayLists15 
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
		ArrayList<Integer> list = new ArrayList<Integer>();		
	    for(int i =0;i < a.length;i++) // copy 
		{	
			list.add(a[i]);
	    }
		System.out.print("Array for: ");
	    for(int i =0;i < a.length;i++) // print out array with for
		{	
			System.out.print(a[i] + " ");
	    }
	    System.out.println();
		System.out.print("Array for each: ");
		for(int i : a) // print out array with for each
		{
			System.out.print(i + " ");
		}
	    System.out.println();
		System.out.print("Arraylist for each: ");
		for(Integer i : list) // print out arraylist with for each
		{
			System.out.print(i + " ");
		}
	    System.out.println();
		System.out.print("Arraylist for: ");
	    for(int i =0;i < list.size();i++) // print out arraylist with for
		{	
			System.out.print(list.get(i) + " ");
	    }
	    System.out.println();
	}
}
