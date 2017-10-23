package com.emids.Services;

import java.util.Scanner;

public class Admin {
	String adminName="chand";
	String adminPassword="emids";
	static Scanner adminScanner=new Scanner(System.in);
	public void verifyAdmin()
	{
		System.out.println("enter the Admin name");
		String adminName=adminScanner.next();
		System.out.println("enter the Admin password");
		String password=adminScanner.next();
		if(adminName.equals(this.adminName)&&password.equals(this.adminPassword))
			System.out.println("Hello Admin.");
		else
		{
			System.out.println("Incorrect adminName and password\n");
			verifyAdmin();
		}
	}

}
