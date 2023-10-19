package com.sunbeam;

import java.util.*;

public class HashMapBook {
	public static int menu() {
		System.out.println("0. Exit");
		System.out.println("1. Insert in a Map");
		System.out.println("2. Find in a Map");
		System.out.println("Enter your choice ");
		int choice = new Scanner(System.in).nextInt();
		return choice;

	}

	public static void main(String[] args) {
		HashMap<String, Book> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			choice = menu();
			switch (choice) {
			case 1:// insert in map
			{
				Book book = new Book();
				book.accept();
				map.put(book.getIsbn(), book);
				System.out.println("Added Successfully");

			}
				break;
			case 2:// find in map
			{
				System.out.println("Enter key to find");
				String s = sc.next();

				Book b = map.get(s);
				System.out.println(b);

			}
				break;
			default: {
				System.out.println("Wrong Input");
			}
			}
		} while (choice != 0);
		System.out.println("Thank you !!!");
	}

}
