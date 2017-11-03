package com.emids.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.emids.domain.Books;

public class BookShelf {
	private BookShelf() {

	}

	private static final Logger LOGGER = Logger.getLogger(BookShelf.class);
	static Scanner scanner = new Scanner(System.in);
	static List<Books> bookLists = new ArrayList<>();

	public static void addTo() {
		LOGGER.debug("\nenter book name to add ?");
		String name = scanner.next();
		bookLists = Product.listOfBooks.stream().filter(p -> p.getBookName().equalsIgnoreCase(name))
				.collect(Collectors.toList());
		if (bookLists.isEmpty())
			LOGGER.error("book not present!!");
		else
			LOGGER.debug("\nbook sucessfully added to Bookshelf\n" + bookLists);

	}

	public static void displayBookShelf() {
		if (bookLists.isEmpty()) {
			LOGGER.debug(bookLists + "\nBookShelf is empty.add books from Availble book store.\n");
			Product.viewBooks();

		} else {
			LOGGER.debug(bookLists);
		}
	}

}
