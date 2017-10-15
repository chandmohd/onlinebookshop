package com.emids.Domain;

import java.util.Scanner;

public class BookShelf {
	public static void addToBookSHelf(String bookName, String author) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Your Details.");
		System.out.println("Please Enter Your Name.");
		String customerName = scanner.nextLine();
		System.out.println("Please Enter Your Address.");
		String customerAddress = scanner.next();
		System.out.println("Please Enter Your State.");
		String customerState = scanner.next();
		System.out.println("Please Enter Your City.");
		String customerCity = scanner.next();
		System.out.println("Please Enter Your Zip code.");
		long zipCode = scanner.nextLong();
		System.out.println("Please Enter Your Contact Number.");
		long contactNumber = scanner.nextLong();
		Customer customer = new Customer(customerName, customerAddress, customerState, customerCity, zipCode,
							contactNumber);
		System.out.println("item successfully added to BookShelf with customer detail: \n" + customer.toString()
				+ "added book: \n" + bookName + " " + author);

		scanner.close();

	}

}
