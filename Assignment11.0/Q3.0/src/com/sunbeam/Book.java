package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book> 
{
	String isbn;
	String authorName;
	int quantity;
	double price;

	public Book() {

	}

	public Book(String isbn, String authorName, int quantity, double price) {
		this.isbn = isbn;
		this.authorName = authorName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter isbn code - ");
		this.isbn = sc.next();
		System.out.println("Enter AuthorName - ");
		this.authorName = sc.next();
		System.out.println("Enter Quantity - ");
		this.quantity = sc.nextInt();
		System.out.println("Enter Price - ");
		this.price = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", authorName=" + authorName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		int hash = Objects.hashCode(isbn);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public int compareTo(Book other) {
		int diff = this.isbn.compareTo(other.isbn);
		return diff;

	}

}
