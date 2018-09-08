/**
 @Author:
 Period:
 Date Started: Sep 09, 2016
 Date Completed:
 Assignment 
 Description:
*/
import kareltherobot.*;

public class Hurdler implements Directions
{
    public static void main(String args[])  
    {
	TrackStar me = new TrackStar(1, 1, East, 0); // replaces UrRobot
          // ! means "not"; do this while loop while TrackStar is not next to a beeper
		{
			me.raceOneBlock();
		}
	while(me.nextToABeeper () )
		{
			me.pickBeeper();
		}
		me.move();
		me.turnOff();
    } 
    static 
    {
        World.reset(); 
        World.readWorld("hu 
        World.setVisible(true);
    }
}
