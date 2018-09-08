//import apcslib.*;
//import chn.util.*;

import java.util.*;

public class Warmup0227 
{
	public static int power(int n, int p)
	{
		if (p <= 0)
		{
			return 1;
		}
		return n * power(n, p - 1);
	}
	
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("n = ");
		int n = scan.nextInt();
		System.out.print("p = ");
		int p = scan.nextInt();
		System.out.println(n + " ^ " + p + " = " + power(n, p));
	}
}
