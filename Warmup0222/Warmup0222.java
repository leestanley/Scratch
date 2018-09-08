/**
 @Author:
 Period:
 Date Started: Feb 22, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup0222 
{
	public static int sum(int n)
	{
		if(n < 0) // error case
		{
			return -1;
		}
		if(n == 0) // base case
		{
			return 0;
		}
		System.out.println(n);
		return n;
	}
	
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("n = ");
		int n = scan.nextInt();
		System.out.println("sum = " + sum(n));
		System.out.println("formula = " + n * (n + 1) / 2);
		if(sum(n) == n * (n + 1) / 2)
		{
			System.out.println("match");
		}
		else
		{
			System.out.println("no match");
		}
	}
}
