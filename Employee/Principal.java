public class Principal extends Employees
{
	private String school;
	private String district; 
	public Principal(String first, String last, String job, double pay, String sch, String dst)
	{
		super(first, last, job, pay); // must be the first line of this constructor
		school = sch;
		district = dst;
	}
	public String getSchool() // accessor
	{
		return school;
	}
	public void setSchool(String sch) // modifier or mutator
	{
		school = sch;		
	}
	public String getDistrict() // accessor
	{
		return district;
	}
	public void setDistrict(String dst) // modifier or mutator
	{
		district = dst;		
	}
	public void print() // overrides the Employee class print method
	{
		super.print(); // does not have to be the first line in any method except the constructor
		System.out.println("School: " + school);
		System.out.println("District: " + district);
	}
}
