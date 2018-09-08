import kareltherobot.*;

public class SolveMaze extends Robot
{
	public SolveMaze(int str, int ave, Direction dir, int nBeeps) // constructor
	{
		super(str, ave, dir, nBeeps); // calls the Robot constructor
	}
		public void turnRight()
    {
		World.setDelay(0);
        turnLeft();
        turnLeft();
        turnLeft();
		World.setDelay(5);
	}
		public void RightTurner()
	{
		World.setDelay(0);
		turnRight();
		if(!frontIsClear() )
			{
				turnRight();
			}
		else
		{
			move();
		}
		World.setDelay(5);		
	}
		public void MazeSolve()
	{
		if(!frontIsClear() )
			{
				RightTurner();
			}
		else
		{
			move();
		}
	}
		public void moveBack()
	{
		World.setDelay(0);
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		World.setDelay(5);
	}
		public int countTurns()
{
	int numTurns = 0;

	while( !frontIsClear() )
	{
		numTurns++; // counts the number of left turns necessary before front is clear
	}
	if (numTurns < 0)
		{
			turnRight();
		}
}


	
}


					