/**
 @Author:
 Period:
 Date Started: Dec 12, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.Scanner;

public class 121216 
{
	
	public static void main(String args[]) 
	{
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		if(!statement.equals("Bye"))
		{
		String response = "";
		if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else
		{
			response = getRandomResponse();
		}

		}
		
	}

}
