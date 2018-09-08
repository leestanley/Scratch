/**
 @Author:
 Period:
 Date Started: Dec 12, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup121216 
{
	
	public static void main(String args[]) 
	{
		System.out.println("Hello, World!");
	}
}


	public String getResponse(String statement)
	{
		String response = "";
		if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "yes") >= 0)
		{
			response = "Are you sure?";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "maybe") >= 0)
		{
			response = "Why so indecisive?";
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
		return response;
	}
