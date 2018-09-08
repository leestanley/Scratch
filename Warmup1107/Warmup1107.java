/**
 @Author:
 Period:
 Date Started: Nov 07, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup1107 
{
	public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
    System.out.print("Please enter a word: ");
    String oword = kb.nextLine();
    String word = oword.toUpperCase();
    int length = word.length();
    StringBuilder sb = new StringBuilder();
    int i = length - 1;
   	 while (i >= 0) {
      sb.append(word.charAt(i));
      i--;
    }
    System.out.println(sb.toString());
}
}


