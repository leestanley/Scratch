/**
 @Author:
 Period:
 Date Started: Dec 06, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup1206
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String in = scan.nextLine();
		String out = "";
		for(int pos = 0; pos < in.length(); pos++)
		{
			String ch = in.substring(pos, pos + 1);
			out += ch + " ";
		}
		System.out.println(out.trim());
	}
}