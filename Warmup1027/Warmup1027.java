/**
 @Author:
 Period:
 Date Started: Oct 27, 2016
 Date Completed:
 Assignment #:
 Description:
*/
//import apcslib.*;
//import chn.util.*;
import java.util.*;

public class Warmup1027
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("n = ");
		int n = scan.nextInt();
		int result = 1;
       	for (int i = 1; i <= n; i++) 
       	{
           result *= i;
           System.out.println(result);
        }
       System.out.println("Factorial: " + result);
   }
}

/*
 int i = 1
 while(i<=n)
 	{
 		result*= i;
 		i++;
 	}
*/

