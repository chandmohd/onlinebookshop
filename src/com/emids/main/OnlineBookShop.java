package com.emids.main;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.emids.services.Admin;
import com.emids.services.BookShelf;
import com.emids.services.Inventory;
import com.emids.services.Product;

public class OnlineBookShop {
	private static final Logger LOGGER = Logger.getLogger(OnlineBookShop.class);
	static Scanner scanner = new Scanner(System.in);
	Inventory inventry = new Inventory();

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		Product.addProduct();
		LOGGER.info("\n---WELCOME TO ONLINE BOOK SHOP---\n");
		LOGGER.info("\nEnter 1 to login as admin\nEnter 0 as normal user\nEnter 99 to exit");
		showOption();
	}

	public static void showOption() {
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			new Admin().verifyAdmin();
			Admin.adminTask();
			break;
		case 0:
			new OnlineBookShop().customerActivity();
			break;
		case 99:
			LOGGER.info("thank you! visit again.");
			System.exit(0);
			break;
		default:
			LOGGER.info("Invalid option.");
			break;
		}

	}

	public void customerActivity() {
		LOGGER.info("\nEnter 1 to see Available product\nEnter 2 to add to bhookShelf\n"
				+ "Enter 3 to add to cart\n" + "Enter 3 to search book\n" + "Enter 0 to exit" + "");
		int userOption = scanner.nextInt();
		switch (userOption) {
		case 1:
			Product.viewBooks();
			customerActivity();
			break;
		case 2:
			BookShelf.addTo();
			break;
		case 3:
			inventry.search();
			break;

		default:
			LOGGER.debug("visit again!");
			System.exit(0);
			break;
		}
	}

}
