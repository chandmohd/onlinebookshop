package com.emids.services;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.emids.domain.Customer;

public class ShoppingCart{
private static final Logger LOGGER=Logger.getLogger(ShoppingCart.class);
	public  void buyProduct(double bookPrice) {
		Scanner scanner = new Scanner(System.in);
		LOGGER.info("Please Enter Your Details.");
		LOGGER.info("Please Enter Your Name.");
		String customerName = scanner.nextLine();
		LOGGER.info("Please Enter Your Address.");
		String customerAddress = scanner.next();
		LOGGER.info("Please Enter Your State.");
		String customerState = scanner.next();
		LOGGER.info("Please Enter Your City.");
		String customerCity = scanner.next();
		LOGGER.info("Please Enter Your Zip code.");
		long zipCode = scanner.nextLong();
		LOGGER.info("Please Enter Your Contact Number.");
		long contactNumber = scanner.nextLong();
		Customer customer = new Customer(customerName, customerAddress, customerState, customerCity, zipCode,
				contactNumber);
		LOGGER.info("Please enter the no of copies of ");
		int noOfCopies = scanner.nextInt();
		double totalPrice = bookPrice * noOfCopies;
		DecimalFormat decimal = new DecimalFormat("0.00");
		LOGGER.info(customer.getName() + " Please pay total amount Rs:" + decimal.format(totalPrice));
		LOGGER.info("order successfully placed.");

		scanner.close();
	}
}
