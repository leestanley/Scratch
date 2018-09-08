public class Teacher extends Employees
{
	private String credential;
	public Teacher(String first, String last, String job, double pay, String cred)
	{
		super(first, last, job, pay); // must be the first line of this constructor
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
		System.out.println("Credential: " + credential);
	}
}
