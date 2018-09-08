/**
 * A program to carry on conversations with a human user.
T * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getName()
	{
		return "Hello, what's your name?";
	}
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		int abc = (int)(Math.random() * 6);
		if (statement.indexOf("no") >= 0 
				|| statement.indexOf("No") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.trim().equals(""))
		{
			response = "Say something, please.";
		}
		else if (statement.indexOf("name") >=0)
		{
			response = "My name is Magpie.";
		}
		else if (statement.indexOf("hello") >=0) 
		{
			response = "Hello!";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family" ;
		}
		else if (statement.indexOf("!") >= 0)
		{
			response = "No need to yell!";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your pets";
		}
		else if (statement.indexOf("bird") >= 0
				|| statement.indexOf("fish") >= 0)
		{
			response = getRandomPetResponse();
		}		
		else if (statement.indexOf("program") >= 0)
		{
			response = "I was coded in Java with JCreator by someone.";
		}
		else if (statement.indexOf("dice") >= 0)
		{
			response = String.valueOf(abc);
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if(whichResponse == 4)
		{
			response = "Wow!"; 
		}
		else if(whichResponse == 5)
		{
			response = "Okay..."; 
		}
		else if(whichResponse == 6)
		{
			response = "Really?"; 
		}
		return response;
	}
	private String getRandomPetResponse()
	{
		final int NUMBER_OF_RESPONSES = 3;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (whichResponse == 1)
		{
			response = "I prefer birds over fish.";
		}
		else if (whichResponse == 2)
		{
			response = "Pets are really fun!";
		}
		return response;
	}
}
