/**
 @Author:
 Period:
 Date Started: Dec 02, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup1202
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		System.out.println();
		String s = scan.nextLine();
		while(s.indexOf(" ") >= 0)
		{
			s = s.substring(0, s.indexOf(" ")) + s.substring(s.indexOf(" ") + 1); // skips blank
		}
		System.out.println(s);
	}
}