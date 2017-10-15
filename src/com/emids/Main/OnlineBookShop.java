package com.emids.Main;

import java.util.Scanner;

import com.emids.Services.Inventory;

public class OnlineBookShop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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

	public static void displayMenu() {
		System.out.println("1->: to view Availale books ");
		System.out.println("2->: to buy  books ");
		System.out.println("3->: to add books to cart");
		System.out.println("4->: to Search books ");
		System.out.println("5->: exit");
		System.out.println("choice ?");

	}

}
