import java.util*;

public class Plot
{
	private int [][]myPlot; // elevations of parcels in a rectangular plot
	
	public Plot(int [][] plot) // constructor
	{
		myPlot = plot;
	}
	
	public int mx(int a []) // returns the maximum value in a 1-dimensional array
	{
		// code not shown
	}
	
	public int mn(int a []) // returns the minimum value in a 1-dimensional array
	{
		// code not shown
		for(int i = 0; i )
		if(a[
	}
	
	public int gradient(int a []) // returns maximum - minimum for row array a of plot
	{
		// code this method to find maximum - minimum for the 1-dimensional array a
		// you may use any methods in this class
	}
	
	public int gradient(int c) // returns maximum - minimum for plot column c
	{
		// code this method
		// make a 1-dimensional array out of column c of the 2-dimensional array plot
		// then call the gradient method for rows with this array
	}
	
	public int gradient() // returns the maximum gradient over all plot rows and columns
	{
		// write this method that finds the maximum gradient over all plot rows and columns
		// you may use any methods in this class
	}
	
	public boolean isSmooth(int thresh) // true if maximum gradient <= thresh, else false
	{
		// write this method; return true if the gradient of the entire plot <= thresh
		// otherwise return false
		// you may use any methods in this class
	}
}

