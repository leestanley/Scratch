/**
 @Author:
 Period:
 Date Started: Mar 29, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class ArrayLists 
{	
	public static void main(String args[])  // shows all the ArrayList methods you need to know
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list.size()); // size is 0 initially
		System.out.println(list.add(new Integer(7))); // 7 is in the last (0) position of list
		System.out.println(list.size()); // size is now 1
		System.out.println(list.add(new Integer(-4))); // -4 is in the last (1) position of list
		System.out.println(list.size()); // size is now 2
		for(int i = 0; i < list.size(); i++) // print the list
		{
			System.out.print(list.get(i) + "  "); // returns the value at position i
		}
		System.out.println();
		for(Integer i : list) // for each Integer i in list do
		{
			System.out.print(i + "  "); // i is already the value, so get is not needed
		}
		System.out.println();
		System.out.println(list.set(0, 1)); // change position 0 to 1
		System.out.println(list.set(1, 2)); // change position 1 to 2
		for(int i = 0; i < list.size(); i++) // print the list
		{
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		for(Integer i : list) // print the list using a for each loop
		{
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println(list.size());
		System.out.println(list.remove(0)); // removes the 1 from position 0; 1 is printed
		System.out.println(list.size()); // size is now 1
		for(int i = 0; i < list.size(); i++) // print the list
		{
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		for(Integer i : list) // for each Integer i in list do
		{
			System.out.print(i + "  ");
		}
		System.out.println();
		list.add(0,3); // put 3 in position 0, 2 is now in position 1
		System.out.println(list.size()); // size is now 2
		for(int i = 0; i < list.size(); i++) // print the list
		{
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		for(Integer i : list) // for each Integer i in list do
		{
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}

