/**
 @Author:
 Period:
 Date Started: Feb 06, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup0206 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How many rows do you have? ");
		int rows = scan.nextInt();
		System.out.print("How many columns do you have? ");
		int columns = scan.nextInt();
		int a[][] = new int[rows][columns];
		int rowA = 0;
		int rowB = 1;
		for(int row = 0; row < a.length; row++) // input values into a
		{
			for(int column = 0; column < a[0].length; column++)
			{
				System.out.print("a[" + row + "][" + column + "] = ");
				a[row][column] = scan.nextInt();
			}
		}
		for(int row = 0; row < a.length; row++) // print a before swapping rows 1 and 2
		{
			for(int column = 0; column < a[0].length; column++)
			{
				System.out.print(a[row][column] + "  ");
			}
			System.out.println();
		}
			int tmpRow[] = a[rowA];
			a[rowA] = a[rowB];
			a[rowB] = tmpRow;
		for(int row = 0; row < a.length; row++) // print a before swapping rows 1 and 2
		{
			for(int column = 0; column < a[0].length; column++)
			{
				System.out.print(a[row][column] + "  ");
			}
			System.out.println();
		}
	}
}
