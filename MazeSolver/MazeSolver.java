/**
 @Author:
 Period:
 Date Started: Sep 30, 2016
 Date Completed:
 Assignment #:
 Description:
*/

import kareltherobot.*;

public class MazeSolver implements Directions
{
    public static void main(String args[])  
    {
        SolveMaze karel = new SolveMaze(1, 1, East, 1000);  
        SolveMaze karel2 = new SolveMaze(1, 2, East, 0); 
		while(!karel.nextToABeeper () ) 
			{	
				karel.turnLeft();
				karel.MazeSolve();
			}
//      boolean done = false;
//      while(!done)
//      {
//        	if(!karel.nextToABeeper())
//        	{
//        		karel.turnLeft();
//        		karel.MazeSolve();
//        	}
//        	if(!karel2.nextToABeeper())
//        	{
//        		karel2.turnLeft();
//        		karel2.MazeSolve();
//        	}
//        }
		karel.pickBeeper();
		karel.moveBack();
		karel.turnOff();
    } 
    static 
    {
        World.reset(); 
        World.readWorld("maze.wld"); //put the path to your world file
        World.setDelay(5);  
        World.setVisible(true);
    }
}
