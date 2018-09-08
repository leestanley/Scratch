/**
 @Author:
 Period:
 Date Started: Nov 01, 2016
 Date Completed:
 Assignment #:
 Description:
*/
//import apcslib.*;
//import chn.util.*;
import java.util.*;

public class Assignment8
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("n = ");
		int n = scan.nextInt();
		int sum = 0;
		int factorial = 1;
       	for (int i = 1; i <= n; i++) 
       	{
       		sum += i;
       		factorial *= i;
       		System.out.println((int)Math.pow(2, i));
        }
       System.out.println("The sum of the first " + n + " integers is " + sum);
       System.out.println(n + "!= " + factorial);
   }
}