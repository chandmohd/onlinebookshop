package com.emids.Main;

import java.util.Scanner;

import com.emids.Services.Admin;
import com.emids.Services.Inventory;
import com.emids.Services.Product;

public class OnlineBookShop {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		int choice;
		do {
			displayMenu();
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				inventory.viewBooks();
				System.out.println();
				break;
			case 2:
					new Admin().verifyAdmin();
					adminTask();
			case 4:
				inventory.search();
				System.out.println();
				break;
			case 5:
				System.out.println("closing online book shop\n");
				break;
			default:
				System.out.println("invalid option. please try again.\n");
				break;
			}
		} while (choice != 5);
		System.exit(0);
	}

	private static void adminTask() {
		System.out.println("Enter 1 to viewBooks\nEnter 2 to add book\nEnter 3 to remove book\nEnter 4 to editBooks");
		int choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
				Product.getBook(Product.listOfBooks);
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
