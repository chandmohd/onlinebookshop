package com.emids.Domain;

public class Books {
	// only books items
	private String bookName;
	private String bookAuthorName;
	private double bookPrice;

	// Parameterized constructor
	public Books(String bookName, String bookAuthorName, double bookPrice) {
		this.bookName = bookName;
		this.bookAuthorName = bookAuthorName;
		this.bookPrice = bookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookAuthorName() {
		return bookAuthorName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookAuthorName(String bookAuthorName) {
		this.bookAuthorName = bookAuthorName;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString()
	{
		return "bookName= "+bookName+", "+"Author= "+bookAuthorName+", "+" price "+bookPrice;
	}

}
