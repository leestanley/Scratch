/**
 @Author:
 Period:
 Date Started: Apr 10, 2017
 Date Completed:
 Assignment #:
 Description:
*/
import java.util.*;

public class Employee
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		// Teacher
		System.out.print("What is the first name of this teacher? ");
		String first = scan.next();
		System.out.print("What is the last name of this teacher? ");
		String last = scan.next();
		System.out.print("What is the job of this teacher? ");
		String job = scan.next();
		System.out.print("What is the pay of this teacher? ");
		double pay = scan.nextDouble();
		System.out.print("What is the credential of this teacher? ");
		String cred = scan.next();
		Teacher teacher = new Teacher(first, last, job, pay, cred);
		System.out.println(teacher.getFirstName());
		System.out.println(teacher.getLastName());
		System.out.println(teacher.getPosition());
		System.out.println("$" + teacher.getSalary());
		System.out.println(teacher.getCredential());
		teacher.print();
		System.out.print("What is the new first name of this teacher? ");
		first = scan.next();
		teacher.setFirstName(first);
		System.out.print("What is the new last name of this teacher? ");
		last = scan.next();
		teacher.setLastName(last);
		System.out.print("What is the new job of this teacher? ");
		job = scan.next();
		teacher.setPosition(job);
		System.out.print("What is the new pay of this teacher? ");
		pay = scan.nextDouble();
		teacher.setSalary(pay);
		System.out.print("What is the new credential of this teacher? ");
		cred = scan.next();
		teacher.setCredential(cred);
		System.out.println(teacher.getFirstName());
		System.out.println(teacher.getLastName());
		System.out.println(teacher.getPosition());
		System.out.println("$" + teacher.getSalary());
		System.out.println(teacher.getCredential());
		teacher.print();
		// Principal
		System.out.print("What is the first name of this principal? ");
		first = scan.next();
		System.out.print("What is the last name of this principal ");
		last = scan.next();
		System.out.print("What is the job of this principal? ");
		job = scan.next();
		System.out.print("What is the pay of this principal? ");
		pay = scan.nextDouble();
		System.out.print("What is the school of this principal? ");
		String school = scan.next();
		System.out.print("What is the district of this principal? ");
		String district = scan.next();
		Principal principal = new Principal(first, last, job, pay, school, district);
		System.out.println(principal.getFirstName());
		System.out.println(principal.getLastName());
		System.out.println(principal.getPosition());
		System.out.println("$" + principal.getSalary());
		System.out.println(principal.getSchool());
		System.out.println(principal.getDistrict());
		principal.print();
		System.out.print("What is the new first name of this principal? ");
		first = scan.next();
		principal.setFirstName(first);
		System.out.print("What is the new last name of this principal? ");
		last = scan.next();
		principal.setLastName(last);
		System.out.print("What is the new job of this principal? ");
		job = scan.next();
		principal.setPosition(job);
		System.out.print("What is the new pay of this principal? ");
		pay = scan.nextDouble(	);
		principal.setSalary(pay);
		System.out.print("What is the new school of this principal? ");
		school = scan.next();
		principal.setSchool(school);
		System.out.print("What is the new district of this principal? ");
		district = scan.next();
		principal.setDistrict(district);
		System.out.println(principal.getFirstName());
		System.out.println(principal.getLastName());
		System.out.println(principal.getPosition());
		System.out.println("$" + principal.getSalary());
		System.out.println(principal.getSchool());
		System.out.println(principal.getDistrict());
		principal.print();
	}
}


