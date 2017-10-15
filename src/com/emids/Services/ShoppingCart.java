package com.emids.Services;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.emids.Domain.BookShelf;
import com.emids.Domain.Customer;

public class ShoppingCart extends BookShelf {

	public static void buyProduct(double bookPrice) {
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
		System.out.println("Please enter the no of copies of ");
		int noOfCopies = scanner.nextInt();
		double totalPrice = bookPrice * noOfCopies;
		DecimalFormat decimal = new DecimalFormat("0.00");
		System.out.println(customer.getName() + " Please pay total amount Rs:" + decimal.format(totalPrice));
		System.out.println("order successfully placed.");
		
		scanner.close();
	}
}
