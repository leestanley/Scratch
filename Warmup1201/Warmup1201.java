/**
 @Author:
 Period:
 Date Started: Dec 01, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup1201 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = scan.nextLine();
		int left = 0;
		int right = 0;
		for(int pos = 0; pos < s.length(); pos++)
		{
			String ch = s.substring(pos, pos + 1);
			if( ch.compareTo( "(" ) == 0)
			{
				left++;
			}
			if( ch.compareTo( ")" ) == 0)
			{
				right++;
			}
		}
		if((s.indexOf("(") <= s.lastIndexOf(")")) && left == right)
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Unbalanced");
		}
	}
}

