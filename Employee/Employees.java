public class Employees
{
	private String firstName; // Employee HAS-A firstName
	private String lastName; // hidden - not directly available to a client
	private String position; // job title or position
	private double salary; // pay per month; double to allow for dollars and cents

	public Employees(String first, String last, String job, double pay)
	{
		firstName = first;
		lastName = last;
		position = job;
		salary = pay;
	}
	public String getFirstName() // accessor method, traditionally of the form getAttribute()
	{
		return firstName;
	}
	public String getLastName() // define this accessor method
	{
		return lastName;
	}
	public String getPosition() // define this accessor method
	{
		return position;
	}
	public double getSalary() // define this accessor method
	{
		return salary;
	}
	public void setFirstName(String name) // modifier (mutator) method, typically setAttribute(type param)
	{
		firstName = name;
	}
	public void setLastName(String name) // define this modifier method
	{
		lastName = name;			
	}
	public void setPosition(String job) // define this modifier method
	{
		position = job;		
	}
	public void setSalary(double pay) // define this modifier method
	{
		salary = pay;		
	}
	public void print() // define this method
	{
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Position: " + position);
		System.out.println("Salary: " +" $" + salary);
		// print the first and last name on one line with a space in between
		// print the position on the next line
		// print the salary on the next line
	}
}


