package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;

/*1. Store few books (hardcoded values with the Book class in previous assignment) in a 
 * HashSet and display them using iterator. If any book with duplicate
isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.*/
public class BookHashSet {

	public static void main(String[] args) {
		HashSet<Book> set = new HashSet<Book>();
		Book b;
		// stored based on Hashcode
		// we have use hashcode and equals to avoid duplicates
		set.add(new Book("abc", "king", 1, 200));
		set.add(new Book("xyz", "jack", 1, 300));
		set.add(new Book("abc", "john", 1, 100));
		set.add(new Book("abc", "Moses", 1, 500));

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book b1 = itr.next();
			System.out.println(b1);
		}

	}

}
