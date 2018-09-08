public class principal extends Employees
{
	private String credential;
	public principal(String first, String last, String job, double pay, String school, String district)
	{
		super(first, last, job, pay, school, district); // must be the first line of this constructor
		credential = cred;
	}
	public String getCredential() // accessor
	{
		return credential;
	}
	public void setCredential(String cred) // modifier or mutator
	{
		credential = cred;		
	}
	public void print() // overrides the Employee class print method
	{
		super.print(); // does not have to be the first line in any method except the constructor
		System.out.println(credential);
	}
}
