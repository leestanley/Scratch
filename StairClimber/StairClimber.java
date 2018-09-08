/**
 @Author:
 Period:
 Date Started: Sep 09, 2016
 Date Completed:
 Assignment #:
 Description:
*/
import kareltherobot.*;

public class StairClimber implements Directions
{
    public static void main(String args[])  
    {
        Climber cat = new Climber(1, 1, East, 0);  
		cat.move();
		cat.move();
		cat.turnLeft();
		cat.move();
		for(int x=0; x < 3; x++)
		{
			cat.turnRight();
			cat.move();
			cat.turnLeft();
			cat.move();
		}
		cat.turnRight();
		cat.move();
		cat.pickBeeper();
		cat.move();
		cat.turnOff();
    } 
    static 
    {
        World.reset(); 
        World.readWorld("stairs.wld");
		World.setDelay(25);
        World.setVisible(true);
    }
}
