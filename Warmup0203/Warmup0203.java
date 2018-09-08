/**
 @Author:
 Period:
 Date Started: Feb 03, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;
public class Warmup0203 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How many rows do you have? ");
		int rows = scan.nextInt();
		System.out.print("How many columns do you have? ");
		int columns = scan.nextInt();
		int a[][] = new int[rows][columns];
		for(int row = 0; row < a.length; row++)
		{
			for(int column = 0; column < a[0].length; column++)
			{
				System.out.print("a[" + row + "][" + column + "] = ");
				a[row][column] = scan.nextInt();
			}
		}
		int minRowIndex = 0;
		int minColumnIndex = 0;
		int maxRowIndex = 0;
		int maxColumnIndex = 0;
		int min = a[0][0];
		int max = a[0][0];
		// add code here
		for(int row = 0; row < a.length; row++)
		{
			for(int column = 0; column < a[0].length; column++)
			{
				if(a[row][column] < min)
				{
					min = a[row][column];
					minRowIndex = row;
					minColumnIndex = column;
				}
				if(a[row][column] > max)
				{
					max = a[row][column];
					maxRowIndex = row;
					maxColumnIndex = column;
				}
			}
		}
		System.out.println("The minimum value " + min +
					" occurs at a[" + minRowIndex + "][" + minColumnIndex + "]");
		System.out.println("The maximum value " + max +
					" occurs at a[" + maxRowIndex + "][" + maxColumnIndex + "]");
	}
}
