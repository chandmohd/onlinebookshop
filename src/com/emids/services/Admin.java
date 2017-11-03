package com.emids.services;

import java.util.Iterator;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.emids.domain.Books;

public class Admin {
	private static final Logger LOGGER=Logger.getLogger(Admin.class);
	private String adminName = "chand";
	private String adminPassword = "emids";
	static Scanner adminScanner = new Scanner(System.in);

	public boolean verifyAdmin() {
		boolean loggedIn = false;
		LOGGER.info("enter the Admin name");
		String name = adminScanner.next();
		LOGGER.info("enter the Admin password");
		String password = adminScanner.next();
		if (name.equals(this.adminName) && password.equals(this.adminPassword)) {
			LOGGER.info("-----Hello Admin----.\n");
			loggedIn = true;
		} else {
			LOGGER.error("Incorrect adminName and password\n");
			verifyAdmin();
		}
		return loggedIn;
	}

	public static void adminTask() {
		LOGGER.info("Enter 1 to add book\nEnter 2 to remove book\nEnter 3 to editBooks\nEnter 4 to exit");
		int choice = adminScanner.nextInt();
		switch (choice) {
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
		default:
			System.exit(0);
			break;
		}
	}

	public static void add() {
		LOGGER.info("enter the book name,book author,book price");
		String bookName = adminScanner.next();
		String author = adminScanner.next();
		double price = adminScanner.nextDouble();
		Product.addBook(new Books(bookName, author, price));
	}

	public static void remove() {
		Iterator<Books> iterator = Product.listOfBooks.iterator();
		LOGGER.info("enter book name to remove ?");
		String bookName = adminScanner.next();
		while (iterator.hasNext()) {
			Books book = iterator.next();
			if (bookName.equalsIgnoreCase(book.getBookName())) {
				Product.remove(book);
				break;
			} else {
				LOGGER.error("mismatched!.book not found by this input.");
				break;
			}
		}
	}

}
