package com.emids.Main;

import java.util.Scanner;

import com.emids.Services.Admin;
import com.emids.Services.BookShelf;
import com.emids.Services.Inventory;
import com.emids.Services.Product;

public class OnlineBookShop {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Product.addProduct();
		Inventory inventory = new Inventory();
		System.out.println("---WELCOME TO ONLINE BOOK SHOP---\n");
		System.out.println("Enter 1 to login as admin\nEnter 0 as normal user");
		int option=scanner.nextInt();
		switch (option) {
		case 1:
			new Admin().verifyAdmin();
			Admin.adminTask();
			break;
		case 0:
			customerActivity();
			break;
		default:System.out.println("Invalid option.");
			break;
		}
			
	}

	public static void customerActivity() {
		System.out.println(
				"Enter 1 to see Available product\nEnter 2 to add to bhookShelf\nEnter 3 to add to cart\nEnter 4 to search book");
		int userOption = scanner.nextInt();
		switch (userOption) {
		case 1:
			Product.getBook(Product.listOfBooks);
			customerActivity();
			break;
		case 2:
			BookShelf.addTo();
			break;
		case 3:

			break;

		default:
			break;
		}
	}

	public static void displayMenu() {
		System.out.println("1->: to view Availale books ");
		System.out.println("2->: login as admin");
		System.out.println("3->: to add books to cart");
		System.out.println("4->: to Search books ");
		System.out.println("5->: exit");
		System.out.println("choice ?");

	}

}
