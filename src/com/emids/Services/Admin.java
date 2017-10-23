package com.emids.Services;

import java.util.Scanner;

public class Admin {
	String adminName="chand";
	String adminPassword="emids";
	static Scanner adminScanner=new Scanner(System.in);
	public boolean verifyAdmin()
	{
		System.out.println("enter the Admin name");
		String adminName=adminScanner.next();
		System.out.println("enter the Admin password");
		String password=adminScanner.next();
		return (adminName.equals(this.adminName)&&password.equals(this.adminPassword))?true:false;
	}

}
