public class MyCircle 
{
	/* Instance Variables (sometimes called Class Variables)
	 */
	private int myRadius;  //The radius of the circle
	
	
	/*---------------------default constructor----------------------------	
    This is a default constructor because it has no parameters.
    This default constructor is optional. 
    */
    public MyCircle()
	{ 
		System.out.println("Hi, everyone...I'm the default constructor!");
	}
	
	
	/*---------------------method findArea--------------------------------	
    Method to compute the area of a circle, given the radius.
    Variable used: 
          radius -- parameter entered by the user.
    */
    public double findArea(int r)
	{ 
		//myRadius = r;
		// Compute and return the area of a circle.
		return Math.PI * Math.pow(r,2);
	}
}
?
