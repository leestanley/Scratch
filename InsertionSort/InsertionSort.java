/**
 @Author:
 Period:
 Date Started: Mar 06, 2017
 Date Completed:
 Assignment #:
 Description:
*/

import java.util.*;	

public class InsertionSort 
{
	public static void insertionSort2(int arr [])
	{
        int temp;
        for (int i = 1; i < arr.length; i++) 
        {
            for(int j = i ; j > 0 ; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return;
	}
	private static void insertionSort(int[] arr) 
	{
		for (int i = 1; i < arr.length; i++) 
		{
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) 
			{
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		return;
	}
	
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How big is your array? ");
		int size = scan.nextInt();
		int a [] = new int [size];
		for(int i = 0; i < a.length; i++)
		{
			System.out.print("Enter your next value: ");
			a[i] = scan.nextInt();
		}
		System.out.println("Here is your unsorted array as entered:");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		insertionSort(a); // since arrays are objects, a is returned in sorted order
		System.out.println("Here is your array sorted using insertion sort:");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
