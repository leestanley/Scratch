/**
 @Author:
 Period:
 Date Started: Jan 31, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup0131
{
	public static int rowSum(int [] a)
	{
	int sum = 0;
	for(int i = 0; i < a.length; i++)
	{
		sum += a[i];
	}
	return sum;
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How many rows do you have? ");
		int rows = scan.nextInt();
		System.out.print("How many columns do you have? ");
		int columns = scan.nextInt();
		int a[][] = new int[rows][columns];
		int rowSums[] = new int[rows];
		for(int row = 0; row < a.length; row++)
		{
			for(int column = 0; column < a[0].length; column++)
			{
				System.out.print("a[" + row + "][" + column + "] = ");
				a[row][column] = scan.nextInt();
			}
		}
		for(int row = 0; row < a.length; row++)
		{
			rowSums[row] = rowSum(a[row]);
		}
		for(int row = 0; row < a.length; row++)
		{
			System.out.println("Row sum for row " + row + " = " + rowSums[row]);
		}
	}
}
