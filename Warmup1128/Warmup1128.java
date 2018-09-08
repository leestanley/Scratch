/**
 @Author:
 Period:
 Date Started: Nov 28, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup1128 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("s1 = ");
		String s1 = scan.next();
		int count = 0;		
		if(s1.compareTo("A") > 0 && s1.compareTo("Z") >= 0 && s1.compareTo("a") && s1.compareTo("z"))
		{
			count++; 
		}
		System.out.println(count - s1.length());
	}
}