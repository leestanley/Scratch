/**
 @Author:
 Period:
 Date Started: Jan 25, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup0125 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		// define arr to be an array of 4 int values:
		int arr[] = new int[4];
		// use a for loop to prompt for and input the first 3 array values
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Next array value = ");
			arr[i] = scan.nextInt();
		}
		// now prompt for and input a new value to be inserted into position 1
		// shift the original values from positions 1 and 2 to positions 2 and 3
		System.out.print("Insert this value into position 1: "); // enter code below



		// print the array values in order on one line
		for(int i = 0; i < 4; i++)
		{
			System.out.print(arr[i] + " ");
		}
		// move to the next line
		System.out.println();
	}
}
