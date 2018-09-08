import kareltherobot.*;

public class TrackStar extends Robot
{
	public TrackStar(int str, int ave, Direction dir, int nBeeps) // constructor
	{
		// code for problem 3 goes here
		super(str, ave, dir, nBeeps);
	}
	public void drawUpDiagonal3()
	{
		// code for problem 4 goes here
		putBeeper();
		turnLeft();
		move();
		turnRight();
		move();
		putBeeper();
		turnLeft();
		move();
		turnRight();
		move();
		putBeeper();
		move();
	}
	public void turnRight()
	{
		World.setDelay(0);  
		turnLeft();
		turnLeft();
		turnLeft();
		World.setDelay(25);  
	}
}
