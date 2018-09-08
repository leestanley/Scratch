/**
 @Author:
 Period:
 Date Started: Mar 07, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class MergeSort 
{
	public static void mergeSort(int a []) // called from main program
	{
		mergeSort(a, 0, a.length - 1); // set up recursion
	}

	private static void mergeSort(int a [], int start, int end) // write this recursive helper method
	{
		int mid = (start + end)/2;	
		if(start != mid)	
		{
			mergeSort(a, start, mid);
		}	
		if(mid + 1 != end)
		{
			mergeSort(a, mid+1,end);
		}
		if(start != end)
		{
			merge(a,start,end);
		}
	}


	public static void print(int a [])
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	private static void merge(int a [], int start, int end) // study this recursive helper method
	{
		int work[] = new int[end - start + 1]; // work array used to merge the two halves
		int mid = (start + end) / 2;
		int left = start; // left half is from start to mid
		int right = mid + 1; // right half is from mid + 1 to end
		int index = 0; // first unmerged position in the work array
		while (left <= mid && right <= end) // still unmerged data in both halves
		{
			if(a[left] < a[right]) // smaller value is to the left
			{
				work[index] = a[left]; // so move from the left
				left++; // move to the next position in the left half
			}
			else // smaller value is to the right
			{
				work[index] = a[right]; // so move from the right
				right++; // move to the next position in the right half
			}
			index++; // move to the next position in the work array
		}
		while(left <= mid) // right half finished first, data remaining in left half
		{
			work[index] = a[left]; // so move the remaining values from the left half
			left++; // move to the next position in the left half
			index++; // move to the next position in the work array
		}
		while(right <= end) // left half finished first, data remaining in right half
		{
			work[index] = a[right]; // so move the remaining values from the right half
			right++; // move to the next position in the right half
			index++; // move to the next position in the work array
		}
		for(index = 0; index < work.length; index++)
		{
			a[start + index] = work[index];
		}
	}

	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How big is your array? ");
		int size = scan.nextInt();
		int a [] = new int [size];
		for(int i = 0; i < a.length; i++)
		{
			System.out.print("Next value please: ");
			a[i] = scan.nextInt();
		}
		System.out.println("Here is your array before sorting:");
		print(a);
		mergeSort(a);
		System.out.println("Here is your array after sorting: ");
		print(a);
	}
}
