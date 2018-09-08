/**
 @Author:
 Period:
 Date Started: Nov 15, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Codes 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = scan.nextLine();
		String j = " "; 
		for(int i = 0; i <= s.length(); i+= 2)
		{
			System.out.print(s.charAt(i));			
		}
	}
}
