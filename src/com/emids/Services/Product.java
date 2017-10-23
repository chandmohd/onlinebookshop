package com.emids.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.emids.Domain.Books;

public class Product {
	static Scanner productScanner = new Scanner(System.in);
	public static List<Books> listOfBooks = new ArrayList<Books>();

	public static void viewBooks() {
		System.out.println("there are the books we have...");
		System.out.println(listOfBooks);

	}

	public static void addProduct() {
		Books book1 = new Books("java", "games", 200.56);
		Books book2 = new Books("c", "dennis", 300.56);
		Books book3 = new Books("c++", "Bjarne", 250.56);
		Books book4 = new Books("javaScript", "Brendan", 209.56);
		Books book5 = new Books("Sql", "Donald", 249.56);
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		listOfBooks.add(book4);
		listOfBooks.add(book5);
	}
	public static void addBook(Books book)
	{
		listOfBooks.add(book);
		System.out.println("book added succesfully\n");
		Product.getBook(Product.listOfBooks);
	}
	public static void getBook(List<Books>list)
	{
		for(int i=0;i<listOfBooks.size();i++)
			System.out.println(listOfBooks.get(i));
		System.out.println();
	}
	public static void remove(Books book)
	{
		listOfBooks.remove(book);
		System.out.println("book removed succesfully\n");
		Product.getBook(Product.listOfBooks);
	}

	public static void editBooksDetails() {
		System.out.println("please enter the book you want to edit..?");
		String bookName = productScanner.next();
		System.out.println("press 1 to edit book name\nPress 2 to edit bookAuthor name\nPress 3 to edit book price");
		int choice = productScanner.nextInt();
		Iterator<Books> iterator = listOfBooks.iterator();
		while (iterator.hasNext()) {
			Books book = iterator.next();
			if (bookName.equalsIgnoreCase(book.getBookName())) {
				Product.replaceBookDetails(choice, book);
				break;
			}
				else {
					System.out.println("mismatched!.please Enter name that present in \n");
					Product.getBook(Product.listOfBooks);
				}
		}
	}

	private static void editBookName(Books book) {
		System.out.println("Please enter the book name to update.");
		book.setBookName(productScanner.next());
		System.out.println("book name has updated to " + book.getBookName());
		Product.getBook(Product.listOfBooks);

	}

	private static void editAuthorName(Books book) {
		System.out.println("Please enter the Author name to update.");
		book.setBookAuthorName(productScanner.nextLine());
		System.out.println("Author name has been updated to " + book.getBookAuthorName());
		Product.getBook(Product.listOfBooks);

	}

	private static void editPrice(Books book) {
		System.out.println("Please enter the book price to update.");
		book.setBookPrice(productScanner.nextDouble());
		System.out.println("Book price  has been updated to " + book.getBookPrice());
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
			System.out.println("invalid option!.Please try again.");
			break;
		}
	}
}
