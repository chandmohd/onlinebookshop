package com.emids.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.emids.domain.Books;
import com.emids.main.OnlineBookShop;

public class Product {
	private Product() {

	}
	private static final Logger LOGGER = Logger.getLogger(Product.class);
	static Scanner productScanner = new Scanner(System.in);
	protected static List<Books> listOfBooks = new ArrayList<>();

	public static void viewBooks() {
		listOfBooks.forEach(System.out::println);
	}

	public static void addProduct() {
		Arrays.asList(new Books("java", "games", 200.56), new Books("c", "dennis", 300.56),
				new Books("c++", "Bjarne", 250.56), new Books("javaScript", "Brendan", 209.56),
				new Books("Sql", "Donald", 249.56)).forEach(listOfBooks::add);
	}

	public static void addBook(Books book) {
		listOfBooks.add(book);
		LOGGER.debug("\nbook added succesfully\n");
		Product.viewBooks();
	}

	public static void getBook(List<Books> list) {
		for (int i = 0; i < list.size(); i++)
			LOGGER.debug(list.get(i));
	}

	public static void remove(Books book) {
		listOfBooks.remove(book);
		LOGGER.debug("\nbook removed succesfully\n");
		Product.viewBooks();
	}

	public static void editBooksDetails() {
		LOGGER.debug("\nplease enter the book you want to edit..?");
		String bookName = productScanner.next();
		LOGGER.debug("\npress 1 to edit book name\nPress 2 to edit bookAuthor name\nPress 3 to edit book price");
		int choice = productScanner.nextInt();
		Books book = (Books) Product.listOfBooks.stream().filter(p -> p.getBookName().equalsIgnoreCase(bookName));
		replaceBookDetails(choice, book);
	}

	private static void editBookName(Books book) {
		LOGGER.debug("\nPlease enter the book name to update.");
		book.setBookName(productScanner.next());
		LOGGER.debug("\nbook name has updated to " + ((Books) book).getBookName());
		Product.viewBooks();

	}

	private static void editAuthorName(Books book) {
		LOGGER.debug("\nPlease enter the Author name to update.");
		((Books) book).setBookAuthorName(productScanner.nextLine());
		LOGGER.debug("\nAuthor name has been updated to " + ((Books) book).getBookAuthorName());
		Product.getBook(Product.listOfBooks);

	}

	private static void editPrice(Books book) {
		LOGGER.debug("\nPlease enter the book price to update.");
		((Books) book).setBookPrice(productScanner.nextDouble());
		LOGGER.debug("Book price  has been updated to " + ((Books) book).getBookPrice());
		Product.getBook(Product.listOfBooks);

	}

	private static void replaceBookDetails(int choice, Books book) {
		switch (choice) {

		case 1:
			Product.editBookName(book);
			break;
		case 2:
			Product.editAuthorName(book);
			break;
		case 3:
			Product.editPrice(book);
			break;
		default:
			LOGGER.error("invalid option!.Please try again.");
			break;
		}
	}
}
