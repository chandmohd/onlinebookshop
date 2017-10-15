package com.emids.Services;

import java.util.Iterator;
import java.util.Scanner;

import com.emids.Domain.Books;

public class Inventory extends Product {
	Scanner scanner = new Scanner(System.in);
	Iterator<Books> iterator = listOfBooks.iterator();

	public void search() {
		int choice;
		System.out.println("press 1 to search book by name");
		System.out.println("press 2 to search book by author name");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter the book name");
			searchByName(scanner.next());
			break;
		case 2:
			System.out.println("enter the author name");
			searchByAuthorName(scanner.next());
			break;
		default:
			System.out.println("Invalid option. please try again.");
			break;
		}
	}

	public void searchByName(String bookName) {
		while (iterator.hasNext()) {
			if (bookName.equalsIgnoreCase(iterator.next().getBookName()))
				System.out.println(bookName + " is Availabe");
			else
				System.out.println(bookName + "is not Available");
		}

	}

	public void searchByAuthorName(String authorName) {
		while (iterator.hasNext()) {
			if (authorName.equalsIgnoreCase(iterator.next().getBookAuthorName()))
				System.out.println("book by " + authorName + " is Availabe.");
			else
				System.out.println("book by " + authorName + " is not Availabe.");
		}
	}

	public static void showBookDetails(Books book) {
		System.out.println("book details");
		System.out.println("book name: " + book.getBookName() + "book author: " + book.getBookAuthorName()
				+ " book price: " + book.getBookPrice());

	}

}
