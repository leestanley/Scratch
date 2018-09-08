import kareltherobot.*;

public class Climber extends Robot
{
	public Climber(int str, int ave, Direction dir, int nBeeps) // constructor
	{
		super(str, ave, dir, nBeeps); // calls the Robot constructor
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