/**
 @Author:
 Period:
 Date Started: Feb 27, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class SelectionSort
{
	public static void selectionSort(int arr [])
	{
		int last = arr.length - 1;
		while(last > 0)
		{
			while(j <= last)
			{
				if(arr[j] > arr[maxpos])
				{
					maxpos = arr[j];
				}
				j++;
			}
			last--;
		}
		return;
	}
	public static void selectionSorts(int arr [])
	{
        for (int i = 0; i < arr.length - 1; i++)
        {
            int lowpos = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[lowpos])
                {
                    lowpos = j;
                }
      		}
            int temp = arr[lowpos]; 
            arr[lowpos] = arr[i];
            arr[i] = temp;
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
		selectionSort(a); // since arrays are objects, a is returned in sorted order
		System.out.println("Here is your array sorted using selection sort:");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
