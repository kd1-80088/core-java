package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class BookTest {

	public static int menu()

	{
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("0.  Exit");
		System.out.println("1. Add new book in list. ");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Search a book with given isbn. ");
		System.out.println("4. Delete a book at given index. ");
		System.out.println("5. Delete book with given isbn. ");
		System.out.println("6. Reverse ");
		System.out.println("7. Save Books in file ");
		System.out.println("8. load Books from file ");

		System.out.print("Enter your choice - ");
		choice = sc.nextInt();
		System.out.println("----------------------------------------------------------------------");
		return choice;
	}

	public static void saveInFile(List<Book> arr) {
		try (FileOutputStream fout = new FileOutputStream("Book1.txt")) {
			try (DataOutputStream dout = new DataOutputStream(fout)) {
				for (Book b1 : arr) {
					dout.writeUTF(b1.getIsbn());
					dout.writeUTF(b1.getAuthorName());
					dout.writeInt(b1.getQuantity());
					dout.writeDouble(b1.getPrice());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data Saved.");
	}

	public static void loadFromFile() {
		try (FileInputStream fin = new FileInputStream("Book1.txt")) {
			try (DataInputStream din = new DataInputStream(fin)) {
				while (true) {
					Book b2 = new Book();

					b2.setIsbn(din.readUTF());
					b2.setAuthorName(din.readUTF());
					b2.setQuantity(din.readInt());
					b2.setPrice(din.readDouble());
					System.out.println(b2);
				}
			}
		} catch (EOFException e) {
			// do nothing
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println("Done.");
	}

	public static void main(String[] args) {
		List<Book> arr = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		Book book;
		System.out.println("array " + arr.toString());
		int choice = 0;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				book = new Book();
				book.accept();
				Book key;
				// key.setIsbn(book.getIsbn());
				if (arr.contains(book)) {
					int index = arr.indexOf(book);
					key = arr.get(index);
					int q = key.getQuantity() + 1;
					key.setQuantity(q);
				} else {
					System.out.println("Book is not Present");
					arr.add(book);
				}
			}
				break;
			case 2: { // Forward traversal

				Iterator<Book> itr = arr.iterator();

				while (itr.hasNext()) {
					book = itr.next();

					System.out.println(book);
				}
			}
				break;
			case 3: { // search
				Book search = new Book();
				String isbn = sc.next();
				System.out.println("Enter isbn to Search index.");
				search.setIsbn(isbn);
				int index = arr.indexOf(search);

				if (index == -1)
					System.out.println(" not found in list.");
				else {
					System.out.println(" found at index: " + index);

					book = arr.get(index);
					System.out.println(book);
				}
			}
				break;
			case 4: {// Delete a book at given index.
				System.out.println("Enter Index to Remove.");
				int index = sc.nextInt();

				arr.remove(index);
			}
				break;

			case 5: { // delete book with given isbn

				Book key = new Book();
				System.out.println("Enter isbn to Remove.");
				String isbn = sc.next();
				key.setIsbn(isbn);
				int index = arr.indexOf(key);
				if (index == -1) {
					System.out.println("isbn is Not Present");
				} else {
					arr.remove(index);
				}

			}
				break;
			case 6: {
				Collections.reverse(arr);
				for (Book ele : arr) {

					System.out.println(ele);
				}
			}
				break;
			case 7: {
				saveInFile(arr);
			}
				break;
			case 8: {
				loadFromFile();
			}
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
		System.out.println("Thank you !!!");
	}

}