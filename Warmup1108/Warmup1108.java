/**
 @Author:
 Period:
 Date Started: Nov 08, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup1108 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("How many voters will you interview? " );
		int n = scan.nextInt();
		String s = scan.next();
		int Clinton = 0; 
		for(int i = 0; i <= n; i++) 
		{
			System.out.println("Who did you vote for in the Presidential election? "  );
			String answer = nextln();
			if(answer = "CLINTON")
			{
				int Clinton++;	
			}
		}
		System.out.println("CLINTON: " + Clinton);
		System.out.println("TRUMP: " + (n - Clinton));
	}
}
