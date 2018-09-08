/**
 @Author:
 Period:
 Date Started: Feb 23, 2017
 Date Completed:
 Assignment #:
 Description:
*/
//import apcslib.*;
//import chn.util.*;

import java.util.*;

public class Warmup0224 
{
	public static boolean isPalindrome(String str)
	{
		if(str.length() <= 1) // true base case
		{
			return true;
		}
		if(!str.substring(0, 1).equals(str.substring(str.length() - 1))) // false base case
		{
			return false;
		}
		return isPalindrome(str.substring(1, str.length() - 1)); // recursive call
	}
	
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = scan.next();
		System.out.println(isPalindrome(s));
	}
}

