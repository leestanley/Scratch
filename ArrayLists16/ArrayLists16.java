/**
 @Author:
 Period:
 Date Started: Mar 29, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class ArrayLists16 
{
	
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter any letter to stop loop");
    	while(scan.hasNextInt())
    	{
			list.add(scan.nextInt());
		}
		int a [] = new int [list.size()];
		int n = 0;
		for(Integer i : list) 
		{
           a[n] = i;
           n++;
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
