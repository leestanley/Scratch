/**
 @Author:
 Period:
 Date Started: Nov 14, 2016
 Date Completed:
 Assignment #:
 Description:
*/
//import apcslib.*;
//import chn.util.*;
import java.util.*;

public class Warmup1114 
{
	
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: " );
		String a = scan.next();
		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i<=a.length(); i++)
		{
			a = a.substring(0, a.indexOf(Alphabet)) + a.substring(a.indexOf() + 1);	
		}
	}
}
