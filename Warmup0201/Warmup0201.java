	/**
 @Author:
 Period:
 Date Started: Feb 01, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup0201
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
		// add code here to find and print the min and max values in a:
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int row = 0; row < a.length; row++)
		{
			for(int column = 0; column < a[0].length; column++)
			{
				if(a[row][column] < min)
				{
					min = a[row][column];
				}
				if(a[row][column] > max)
				{
					max = a[row][column];
				}
			}
		}
		System.out.println("min = " + min);
		System.out.println("max = " + max);
	}
}

