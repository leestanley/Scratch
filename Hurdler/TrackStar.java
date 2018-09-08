import kareltherobot.*;

public class TrackStar extends Robot
{
	public TrackStar(int str, int ave, Direction dir, int nBeeps) // constructor
	{
		super(str, ave, dir, nBeeps); // calls the Robot constructor
	}
	public void turnRight()
    {
		World.setDelay(0);
        turnLeft();
        turnLeft();
        turnLeft();
		World.setDelay(20);
    }
	public void Land()
	{
		while(frontIsClear() )
		{
			move();
		}
		turnLeft();
	} 
	public void WallCheckJump()
	{
		while(!frontIsClear() )
		{
			turnLeft();
			move();
			turnRight();
		}
			move();
			move();
			turnRight();
	}
public void jumpHighHurdle()
	{
		while(frontIsClear() )
		{
			move();
		}
		WallCheckJump();
		Land();
	}
		
