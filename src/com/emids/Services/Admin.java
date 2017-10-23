package com.emids.Services;

import java.util.Iterator;
import java.util.Scanner;

import com.emids.Domain.Books;

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
			System.out.println("-----Hello Admin----.\n");
		else
		{
			System.out.println("Incorrect adminName and password\n");
			verifyAdmin();
		}
	}
	public static void adminTask() {
		System.out.println("Enter 1 to add book\nEnter 2 to remove book\nEnter 3 to editBooks");
		int choice=adminScanner.nextInt();
		switch(choice)
		{
		case 1:
				add();
				adminTask();
				break;
		case 2:
				remove();
				adminTask();
				break;
		case 3:
				Product.editBooksDetails();
				adminTask();
				break;
		}
	}
	public static void add()
	{
		System.out.println("enter the book name,book author,book price");
		String bookName=adminScanner.next();
		String author=adminScanner.next();
		double price=adminScanner.nextDouble();
		Product.addBook(new Books(bookName,author,price));
	}
	public static void remove() {
		Iterator<Books>iterator=Product.listOfBooks.iterator();
		System.out.println("enter book name to remove ?");
		String bookName=adminScanner.next();
		while(iterator.hasNext())
		{
			Books book=iterator.next();
			if(bookName.equalsIgnoreCase(book.getBookName())) {
				Product.remove(book);
				break;
			}
			else
				System.out.println("mismatched!.book not found by this input.");
		}
	}

}
