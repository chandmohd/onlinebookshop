package com.emids.Main;

import java.util.Scanner;

import com.emids.Services.Admin;
import com.emids.Services.BookShelf;
import com.emids.Services.Inventory;
import com.emids.Services.Product;

public class OnlineBookShop {
	static Scanner scanner = new Scanner(System.in);
	Inventory inventry=new Inventory();
	public static void main(String[] args) {
		Product.addProduct();
		System.out.println("---WELCOME TO ONLINE BOOK SHOP---\n");
		System.out.println("Enter 1 to login as admin\nEnter 0 as normal user\nEnter 99 to exit");
		showOption();
	}
		public static void showOption() {
		int option=scanner.nextInt();
		switch (option) {
		case 1:
			new Admin().verifyAdmin();
			Admin.adminTask();
			break;
		case 0:
			new OnlineBookShop().customerActivity();;
			break;
		case 99: 
			System.exit(0);
			break;	
		default:System.out.println("Invalid option.");
			break;
		}
			
	}

	public  void customerActivity() {
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
			inventry.search();
			break;

		default:
			break;
		}
	}

}
