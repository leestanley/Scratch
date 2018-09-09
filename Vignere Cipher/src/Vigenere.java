import java.util.*;
public class Vigenere 
{
	
	public static void main(String args[]) 
	{
		String plaintext;
		int plaintextLength;
		int keyLength;
		String key = "";
		Scanner in = new Scanner(System.in);
		boolean more = true;
		
		while(more)
		{
			System.out.println("What is your plaintext? ");
			plaintext = in.nextLine(); 
			plaintextLength = plaintext.length();
			System.out.println();
			
			for(int i = 0, length = plaintext.length(); i < length; i++) {
				if(plaintext.charAt(i) == 32) {
					plaintextLength--;
				}
			}
			
			//97 122 ascii value for a-z
			
			keyLength = (int)(Math.random() * plaintextLength) + 1;
			
			System.out.println("Key Length: " + keyLength);
		
			for(int j = 0; j < keyLength; j++) {
				int asciiNum = (int)(Math.random() * (122 - 97) + 1) + 97;  // 122 is the ascii value for 'z' and 97 is the ascii value for 'a'
				key += (char)asciiNum;
			}
			
			System.out.println("Key: " + key);
			System.out.println("CipherText: " + cipher(plaintext, key));
			key = "";
			System.out.println();
			System.out.println("Continue? Type N to Stop");
			String test = in.nextLine();
			if(test.equalsIgnoreCase("N"))
			{
				break;
			}
		}
	}
	
	public static String cipher(String plaintext, String key) {
		String encrypted = ""; //encrypted message
		int count = 0;
		for(int i = 0; i < plaintext.length(); i++)
		{
			
			if(plaintext.charAt(i) == 32)
			{
				//If plaintext is space, put space in encryption but don't increment index of key
				encrypted += " ";
				continue;
			}
			if(plaintext.charAt(i) >= 65 && plaintext.charAt(i) <= 90)
			{
				//Checks to see if sum is > 90 (Z); Adds and subtracts 26; Otherwise, Add together
				encrypted += plaintext.charAt(i) + getShift(key,count) > 90 ? (char)((plaintext.charAt(i) + getShift(key, count)) - 26) : (char)(plaintext.charAt(i) + getShift(key, count));
				count++;
			} else if(plaintext.charAt(i) >= 97 && plaintext.charAt(i) <= 122)
			{
				//Checks to see if sum is > 122 (z); Adds and subtracts 26; Otherwise, Add together
				encrypted += plaintext.charAt(i) + getShift(key, count) > 122 ? (char)((plaintext.charAt(i) + getShift(key, count)) - 26) : (char)(plaintext.charAt(i) + getShift(key, count));
				count++;
			}
			else{
				encrypted += plaintext.charAt(i);
				continue;
			}
		}
		return encrypted;
	}
	
	//Determines units to shift to the right since key is in lowercase
	private static int getShift(String key, int i)
	{
		// i % key.length() is position
		return ((int)key.charAt(i % key.length()) - 97);
	}
	
}










