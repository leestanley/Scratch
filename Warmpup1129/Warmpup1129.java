/**
 @Author:
 Period:
 Date Started: Nov 29, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmpup1129 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = scan.nextLine();
		int count1 = 0;
		int count2 = 0;
		String left = "(";
		String right = ")"; 
		for(int pos = 0; pos < s.length(); pos++)
		{
			String ch = s.substring(pos, pos + 1); 
			if(left.indexOf(ch) >= 0) // found a digit an alternative way
			{
				count1++;
			}
			else if(right.indexOf(ch) >= 0)
			{
				count2++;
			}
		}
		System.out.println(count1); 
		System.out.println(count2);
	}
}
