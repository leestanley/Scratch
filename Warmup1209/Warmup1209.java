/**
 @Author:
 Period:
 Date Started: Dec 09, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup1209 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How many columns? ");
		int c = scan.nextInt();
		double [][] d = new double [2][c];
		for(int row = 0; row < d.length; row++)
		{
			for(int column = 0; column < d[0].length; column++)
			{
				System.out.print("Next value = ");
				d[row][column] = scan.nextDouble();
			}
		}
		for(int row = 0; row < d.length; row++)
		{
			for(int column = 0; column < d[0].length; column++)
			{
				System.out.print(d[row][column] + " ");
			}
			System.out.println();
		}
		// insert your code here
		int temp = d[2][c-1];
		for(int row = 0; row < d.length; row++)
		{
			for(int column = 0; column < d[0].length; column++)
			{
				double temping = d[row][column]; 
				(double)d[row+1][column+1] = temping;
			}
		}
		d[0][0] = temp;
		for(int row = 0; row < d.length; row++)
		{
			for(int column = 0; column < d[0].length; column++)
			{
				System.out.print(d[row][column] + " ");
			}
			System.out.println();
		}
	}
}