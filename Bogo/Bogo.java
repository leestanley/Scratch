/**
 @Author:
 Period:
 Date Started: Mar 09, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Bogo {

	public Bogo(int[] i) {
		int counter = 0;
		System.out.println("I'll sort " + i.length + " elements...");
		while(!isSorted(i)) {
			shuffle(i);
			counter++;
			System.out.println(counter);
		}
		System.out.println("Solution found! (shuffled " + counter + " times)");
		print(i);
	}

	private void print(int[] i) {
		for(int x : i) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}

	private void shuffle(int[] i) {
		for(int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length),
				index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}

	private boolean isSorted(int[] i) {
		for(int x = 0; x < i.length - 1; ++x) {
			if(i[x] > i[x+1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter any letter to stop loop");
    	while(scan.hasNextInt())
    	{
			list.add(scan.nextInt());
		}
		int a [] = new int [list.size()];
		int n = 0;
		for(Integer i : list) 
		{
           a[n] = i;
           n++;
		}
		new Bogo(i);
	}

}