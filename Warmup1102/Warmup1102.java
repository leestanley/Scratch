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

public class Warmup1102
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
        }
       System.out.println(n + "!= " + result);
   }
}