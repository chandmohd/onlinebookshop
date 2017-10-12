package com.emids.Services;

import java.util.Scanner;

public class Inventory {
	Scanner scanner = new Scanner(System.in);

	public void search() {
		int choice;
		System.out.println("press 1 to search book by name");
		System.out.println("press 2 to search book by author name");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter the book name");
			System.out.println(searchByName(scanner.next()));
			break;
		case 2:
			System.out.println("enter the author name");
			System.out.println(searchByAuthorName(scanner.next()));
			break;
		default:
			System.out.println("Invalid option. please try again.");
		}
	}

	public String searchByName(String bookName) {
		// if(bookName.equalsIgnoreCase()
		return bookName;
	}

	public String searchByAuthorName(String authorName) {
		return authorName;
	}

}
