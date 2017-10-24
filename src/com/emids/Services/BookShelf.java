package com.emids.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.emids.Domain.Books;
import com.emids.Main.OnlineBookShop;

public class BookShelf {
 static Scanner scanner=new Scanner(System.in);
 static List<Books>bookLists=new ArrayList<>();
 static Iterator<Books>iterator=Product.listOfBooks.iterator();
	public static void addTo() {
		System.out.println("enter book name to add ?");
		String name=scanner.next();
		while(iterator.hasNext())
		{
			Books book=iterator.next();
			if(name.equalsIgnoreCase(book.getBookName())) {
				bookLists.add(book);
				System.out.println("book added succesfully.");
				displayBookShelf();
				return;
			}
			
			}
			System.out.println("book not found in bookStore.\n");
			new OnlineBookShop().customerActivity();
		
		
	}
	public static void displayBookShelf()
	{
		if(bookLists.isEmpty()) {
			System.out.println(bookLists+"\nBookShelf is empty.add books from Availble book store.\n");
			Product.getBook(Product.listOfBooks);
		}
		else {
			for(int i=0;i<bookLists.size();i++)
				System.out.println(bookLists.get(i)+"\n");
		}
	}

}
