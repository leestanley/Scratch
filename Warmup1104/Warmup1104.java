/**
 @Author:
 Period:
 Date Started: Nov 07, 2016
 Date Completed:
 Assignment #:
 Description:
*/
//import apcslib.*;
//import chn.util.*;
import java.util.*;

public class Warmup1104 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = scan.next();
		for(int pos = 0; pos <= s.length(); pos++)
		{
			System.out.println(s.substring(0, pos));
		}
	}
}
