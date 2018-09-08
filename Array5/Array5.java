/**
 @Author:
 Period:
 Date Started: Feb 01, 2017
 Date Completed:
 Assignment #:
 Description:
*/

import java.util.*;

public class Array5 
{

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How many rows do you have? ");
		int rows = scan.nextInt();
		System.out.print("How many columns do you have? ");
		int columns = scan.nextInt();
		int a[][] = new int[rows][columns];
		int[] col =new int[columns];
		int sum = 0;
		for(int row = 0; row < a.length; row++)
		{
			for(int column = 0; column < a[0].length; column++)
			{
				System.out.print("a[" + row + "][" + column + "] = ");
				a[row][column] = scan.nextInt();
			}
		}
		int min = a[0][0];
		int max = a[0][0];
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
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
				{
                sum += a[i][j];
				col[j] += a[i][j];
				}
            System.out.println("Print the sum of row " + i + " = " + sum);
			sum = 0;
        }
		for (int i = 0; i < col.length; i ++)
		{
			System.out.println("Print the sum of column " + i + " = " + col[i]);			
		}
		System.out.println("Min = " + min);
		System.out.println("max = " + max);
	}
}
