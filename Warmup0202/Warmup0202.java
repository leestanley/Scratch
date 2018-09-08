/**
 @Author:
 Period:
 Date Started: Feb 02, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup0202
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How many rows do you have? ");
		int rows = scan.nextInt();
		System.out.print("How many columns do you have? ");
		int columns = scan.nextInt();
		int a[][] = new int[rows][columns];
		int columnSum[] = new int[a[0].length]; 
		for(int row = 0; row < a.length; row++)
		{
			for(int column = 0; column < a[0].length; column++)
			{
				System.out.print("a[" + row + "][" + column + "] = ");
				a[row][column] = scan.nextInt();
			}
		}
		for(int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
				{
				columnSum[j] += a[i][j];
				}
        }
		for(int column = 0; column < a[0].length; column++)
		{
			System.out.println("Column " + column + " sum = " + columnSum[column]);
		}
	}
}
