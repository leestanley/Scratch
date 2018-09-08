/**
 @Author:
 Period:
 Date Started: Nov 10, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warnup1210
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = scan.nextLine();
		int count = 0;
		for (int index = s.indexOf("a"); index >= 0; index = s.indexOf("a", index + 1))
		{
    		count++;
		}
		System.out.println(count);
	}
}