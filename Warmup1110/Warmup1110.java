/**
 @Author:
 Period:
 Date Started: Nov 10, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup1110 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = scan.nextLine();
		while(s.indexOf(" ") >= 0)
		{
			s = s.substring(0, s.indexOf(" ")) + s.substring(s.indexOf(" ") + 1);
		}
		System.out.println(s);
	}
}
