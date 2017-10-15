package com.emids.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.emids.Domain.Books;

public class Product {
	Scanner productScanner = new Scanner(System.in);
	Product product = new Product();
	static List<Books> listOfBooks = new ArrayList<Books>();

	public static void viewBooks() {
		System.out.println("there are the books we have...");
		System.out.println(listOfBooks);

	}

	public static List<Books> addProduct() {
		Books book1 = new Books("java", "games gosling", 200.56);
		Books book2 = new Books("c", "dennis ritchie", 300.56);
		Books book3 = new Books("c++", "Bjarne Stroustrup", 250.56);
		Books book4 = new Books("javaScript", "Brendan Eich", 209.56);
		Books book5 = new Books("Sql", "Donald D. Chamberlin", 249.56);
		Collections.addAll(listOfBooks, book1, book2, book3, book4, book5);
		return listOfBooks;
	}

	public void editBooksDetails() {
		System.out.println("please enter the book you want to edit..?");
		String bookName = productScanner.next();
		System.out.println("press 1 to edit book name, press 2 to edit bookAuthor name , press 3 to edit book price");
		int choice = productScanner.nextInt();
		Iterator<Books> iterator = listOfBooks.iterator();
		while (iterator.hasNext()) {
			Books book = (Books) iterator.next();
			if (bookName.equalsIgnoreCase(book.getBookName()))
				product.replaceBookDetails(choice, book);
		}
	}

	private void editBookName(Books book) {
		System.out.println("Please enter the book name to update.");
		book.setBookName(productScanner.next());
		System.out.println("book name has updated to " + book.getBookName());

	}

	private void editAuthorName(Books book) {
		System.out.println("Please enter the Author name to update.");
		book.setBookAuthorName(productScanner.nextLine());
		System.out.println("Author name has been updated to " + book.getBookAuthorName());

	}

	private void editPrice(Books book) {
		System.out.println("Please enter the book price to update.");
		book.setBookPrice(productScanner.nextDouble());
		System.out.println("Book price  has been updated to " + book.getBookPrice());

	}

	private void replaceBookDetails(int choice, Books book) {
		switch (choice) {

		case 1:
			product.editBookName(book);
			break;
		case 2:
			product.editAuthorName(book);
			break;
		case 3:
			product.editPrice(book);
			break;
		default:
			System.out.println("invalid option!.Please try again.");
			break;
		}
	}
}
