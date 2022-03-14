package com.mysystem.Driver;

import java.util.Scanner;
import com.mysytem.service.EmpCredentialsService;
import com.mysytem.model.Employee;

public class EmpMain {
	
	public static void main(String[] args) {
		
		Employee empl= new Employee("Raja","Yannam");
		EmpCredentialsService emailgen= new EmpCredentialsService();
		
	 String deptName= departmentname();
	String emailid= emailgen.Genemailid(empl.empFirstName.toLowerCase(),empl.empLastName.toLowerCase(), deptName);
	///emailgen.Genemailid(empl.getempFirstName(), empl.getempLastName(), empl.getdepartmentName())
			
	char[] password= emailgen.GenPassword();
	emailgen.displayempinfo(empl.empFirstName,emailid,password);
	}
	
	public static String departmentname() {
		
	System.out.println("Please enter the department from the following");
	System.out.println("1"+ "." + "Technical");
	System.out.println("2"+ "." + "Admin");
	System.out.println("3"+ "." + "Human Resource");
	System.out.println("4"+ "." + "Legal");
	
	Scanner sc= new Scanner(System.in);
	int choice=sc.nextInt();
	String domain;
	
	if (choice==1) 
	{
		domain="Tech";
	}
	
	else if (choice==2)
	{
		domain="Adm";
	}
	else if (choice==3)
	{
		domain="HR";
	}
	else 
	{
		domain="lgl";
	}
	
	sc.close();
	return domain;
	}
	
	}

