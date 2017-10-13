package com.emids.Services;

import java.util.ArrayList;

import com.emids.Domain.Books;

public class Product {
	Books book[] = { new Books("java", "games", 300.67), new Books("c", "DennisRiched", 200.67),
			new Books("c++", "Bjarne", 500.80), new Books("javaScript", "johan", 600.67) };
	public ArrayList<Books> bookcontainer = new ArrayList<Books>();

	public void viewProduct() {
		System.out.println("book Author Price");
		for (int i = 0; i < book.length; i++) {
			System.out
					.println(book[i].getBookName() + ":" + book[i].getBookAuthorName() + ":" + book[i].getBookPrice());
		}

	}

	public void addProduct(Object book) {

		System.out.println("product added .");
	}

	public void buyProduct(Object book) {

	}

}
