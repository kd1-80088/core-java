package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*4. Use TreeSet to store all books in descending order of price. Natural ordering for the Book 
 * should be isbn (do not change it). Display them using iterator() and descendingIterator().*/
public class BookTreeSet {

	public static void main(String[] args) {

		class TreePriceComparator implements Comparator<Book> {

			public int compare(Book b1, Book b2) {
				int diff =- Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
		}
		TreePriceComparator comparator = new TreePriceComparator();
		TreeSet<Book> set = new TreeSet<Book>(comparator);

		set.add(new Book("222", "Jack", 1, 4000));
		set.add(new Book("444", "Jack", 1, 5000));
		set.add(new Book("111", "Kat", 1, 2000));
		set.add(new Book("333", "Moses", 1, 3000));
		set.add(new Book("222", "Jack", 1, 1000));
		set.add(new Book("111", "Jack", 1, 2000));
		set.add(new Book("333", "Jack", 1, 1000));
		set.add(new Book("333", "Jack", 1, 5000));

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
		System.out.println("-----------------------------------------------");
		// using descendingIterator
		Iterator<Book> itr1 = set.descendingIterator();
		while (itr1.hasNext()) {
			Book b1 = itr1.next();
			System.out.println(b1);
		}
	}

}
