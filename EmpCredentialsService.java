package com.mysytem.service;
import java.util.Random;



public class EmpCredentialsService {
	
	
	public String Genemailid(String firstname,String lastname, String departmentname)
	{
		  String emailid;
		  emailid = firstname + lastname + "@" + departmentname + ".abc.com";
		  
		  return emailid;

	}
	
	public char[] GenPassword() {
		String s1= new String("abcdefghijklmnopqrstuvwxyz@#$%^&*=/123456789");
		int length=8;
		char[] password = new char[length];
		Random random= new Random();
		
		for (int i=0;i<length;i++)
		{
			int randomindex= random.nextInt(s1.length());
			password[i]=s1.charAt(randomindex);
		}
		
		return password;
	}
	
	public void displayempinfo(String firstname,String emailid,char[] password) 
	{
		System.out.println("Dear" + " " + firstname + " "+ "your generated credentials are as follows");
		System.out.println("EmailId" + "------>" + emailid);
		System.out.println("password" + "------>" + new String(password));
	}
     
	
	

}
