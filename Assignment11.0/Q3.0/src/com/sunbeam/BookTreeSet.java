package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*3. In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. 
 * If any book with duplicate isbn is added, what will happen? Books are stored in which order?*/
public class BookTreeSet {

	public static void main(String[] args) {
//		class TreeSetComparator implements Comparator<Book> {
//			@Override
//			public int compare(Book b1, Book b2) {
//				int diff = b1.getAuthorName().compareTo(b2.getAuthorName());
//				return diff;
//			}
//		}
//		TreeSetComparator comparator = new TreeSetComparator();
//		TreeSet<Book> set = new TreeSet<Book>(comparator);

		TreeSet<Book> set = new TreeSet<Book>();
		// sorts in natural ordering
		// does not take Duplicates
		set.add(new Book("333", "Jack", 1, 2000));
		set.add(new Book("333", "John", 1, 2000));
		set.add(new Book("111", "Joe", 1, 2000));
		set.add(new Book("222", "Jack", 1, 2000));
		set.add(new Book("111", "Jack", 1, 2000));

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book b1 = itr.next();
			System.out.println(b1);
		}

	}

}
