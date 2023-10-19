package com.sunbeam;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*2. In above assignment use LinkedHashSet instead of HashSet. If any book with duplicate isbn is added, 
 * what will happen? Books are stored in which order?*/
public class BookLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<Book> set = new LinkedHashSet<Book>();

		// prints in given order
		// duplicates not allowed
		set.add(new Book("444", "Jack", 1, 2000));
		set.add(new Book("111", "Jack", 1, 2000));
		set.add(new Book("222", "Jack", 1, 2000));
		set.add(new Book("111", "Jack", 1, 2000));
		set.add(new Book("333", "Jack", 1, 2000));
		set.add(new Book("333", "Jack", 1, 2000));
		set.add(new Book("333", "Jack", 1, 2000));

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
	}

}
