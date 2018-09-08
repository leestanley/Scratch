/**
 @Author:
 Period:
 Date Started: Feb 07, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup0207 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How many rows and columns do you want? ");
		int n = scan.nextInt();
		String [][] string = new String[n][n]; // a square array, same number of rows and columns
		for(int row = 0; row < n; row++)
		{
			for(int column = 0; column < n; column++)
			{
				System.out.print("Enter a String: ");
				string[row][column] = scan.next();
			}
		}
		for(int row = 0; row < n; row++)
		{
			for(int column = 0; column < n; column++)
			{
				System.out.print(string[row][column] + " ");
			}
			System.out.println();
		}
		for(int row = 0; row < n; row++)
		{
				System.out.print(string[row][row] + " ");
		}
		System.out.println();
	}
}

