package com.emids.Services;

import java.util.ArrayList;
import com.emids.Domain.Books;

public class Product {
	public static ArrayList<Books> bookcontainer = new ArrayList<Books>(10);
	{
		bookcontainer.add(new Books("java", "games", 300.67));
		bookcontainer.add(new Books("c", "DennisRiched", 200.67));
		bookcontainer.add(new Books("paython", "Guido", 400.67));
		bookcontainer.add(new Books("c++", "Bjarne", 500.80));
		bookcontainer.add(new Books("javaScript", "johan", 600.67));
	}

	public void viewProduct() {
		System.out.println(bookcontainer);
	}

	public void addProduct(Object book) {
		System.out.println();
	}

	public void buyProduct(Object book) {

	}

}
