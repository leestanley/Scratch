/**
 @Author:
 Period:
 Date Started: Dec 07, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;
public class Warmup1207 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = scan.next();
		String answer = "";
		int i = s.indexOf("the");
		int pos = 0;
		while(s.indexOf("the") >= 0) 
		{
		pos++;
  		i = str.indexOf('the', i+3);
		answer += s.substring(pos, i);
		}
		System.out.println(answer);
	}
}

