package com.emids.services;

import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

import com.emids.domain.Books;
import com.emids.main.OnlineBookShop;

public class Inventory {
	private static final Logger LOGGER = Logger.getLogger(Inventory.class);
	Scanner scanner = new Scanner(System.in);
	Iterator<Books> iterator = Product.listOfBooks.iterator();

	public void search() {
		LOGGER.debug("press 1 to search book by name\nEnter 2 to search book by author name");
		switch (scanner.nextInt()) {
		case 1:
			LOGGER.debug("enter the book name");
			LOGGER.debug(searchByName(scanner.next()));
			break;
		case 2:
			LOGGER.debug("enter the author name");
			LOGGER.debug(searchByAuthorName(scanner.next()));
			break;
		default:
			LOGGER.debug("Invalid option. please try again.");
			break;
		}
	}

	public Optional<Books> searchByName(String bookName) {
		return Product.listOfBooks.stream().filter(p -> p.getBookName().equalsIgnoreCase(bookName)).findAny();

		}

	public Optional<Books> searchByAuthorName(String authorName) {
		return Product.listOfBooks.stream().filter(p->p.getBookAuthorName().equalsIgnoreCase(authorName)).findAny();
	}

	public static void showBookDetails(Books book) {
		LOGGER.debug("book details");
		LOGGER.debug("book name: " + book.getBookName() + "book author: " + book.getBookAuthorName()
				+ " book price: " + book.getBookPrice());

	}

}
