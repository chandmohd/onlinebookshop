package com.emids.Services;

import java.util.Scanner;

public class Inventory {
	Scanner scanner = new Scanner(System.in);
	Product product = new Product();

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
		for (int i = 0; i < product.bookcontainer.size(); i++) {
			if (bookName.equalsIgnoreCase(product.book[i].getBookName()))
				System.out.println("book found");
			else
				System.out.println("book not found.!");
		}
		return "sorry. " + bookName + " book is not available";
	}

	public String searchByAuthorName(String authorName) {
		for (int i = 0; i < product.bookcontainer.size(); i++) {
			if (authorName.equalsIgnoreCase(product.book[i].getBookAuthorName()))
				System.out.println("book found");
			else
				System.out.println("book by not found.!");
		}
		return "sorry.Book by " + authorName + " name is not available.";

	}

}
