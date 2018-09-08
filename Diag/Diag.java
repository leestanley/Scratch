/**
 @Author:
 Period:
 Date Started: Sep 15, 2016
 Date Completed:
 Assignment #:
 Description:
*/

import kareltherobot.*;

public class Diag implements Directions
{
    public static void main(String args[])  
    {
        TrackStar karel = new TrackStar(1, 1, East, 3);  
        karel.drawUpDiagonal3(); 
    } 

    static 
    {
        World.reset(); 
        World.readWorld("firsst.wld"); //put the path to your world file
        World.setDelay(10);  
        World.setVisible(true);
    }
}
