/**
 @Author:
 Period:
 Date Started: Mar 30, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Warmup0330 
{
	private int [][] myMat;
	private final int SIZE;
	
	/**
	 * Creates a SIZE x SIZE matrix of integers by setting
	 * it equal to the specified matrix.
	 * @param matrix a SIZE x SIZE matrix of integers
	 * Postcondition: myMat may or may not be a magic square
	 */
	public Warmup0330(int [][] matrix)
	{
		myMat = matrix;
		if(myMat == null)
			SIZE = 0;
		else
			SIZE = myMat.length;
	}
	 
	/**
	 * Displays matrix on screen
	 */
	public void writeMatrix()
	{ /* implementation not shown */ }

	/**
	 * Precondition:  0 <= row < SIZE.
	 * @param row a row of the matrix
	 * return the sum of elements in row
	 */
	public int sumRow(int row)
	{ /* to be implemented in part (a) */ }	
 
	/**
	 * Precondition:  0 <= col < SIZE.
	 * @param col a column of the matrix
	 * return the sum of elements in col
	 */
	public int sumCol(int col)
	{ /* implementation not shown */ }
	
	/**
	 * @return the sum of elements in the major diagonal
	 */
	public int sumMajorDiag()
	{ /* implementation not shown */ }
	
	/**
	 * @return the sum of elements in the minor diagonal
	 */
	public int sumMinorDiag()
	{ /* to be implemented in part (b) */ }
	
	/**
	 * Precondition: myMat is a square matrix of integers,
	 *		 which may or may not be a magic square.
	 * @return true if myMat is a magic square, false otherwise
	 */
	public boolean isMagic()
	{ /* to be implemented in part (c) */ }

}
