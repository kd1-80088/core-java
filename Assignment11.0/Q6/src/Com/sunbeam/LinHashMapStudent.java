package Com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.*;

public class LinHashMapStudent {
	public static int menu() {
		System.out.println("0. Exit");
		System.out.println("1. Insert in a Map");
		System.out.println("2. Find in a Map");
		System.out.println("Enter your choice ");
		int choice = new Scanner(System.in).nextInt();
		return choice;

	}

	public static void main(String[] args) {

		LinkedHashMap<Integer, Student> map = new LinkedHashMap<>();

		int choice;

		do {
			choice = menu();
			switch (choice) {
			case 1://
			{
				Student s = new Student();
				s.acceptData();

				map.put(s.getRoll(), s);
				System.out.println("Added Successfully");
			}
				break;

			case 2: {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter key to find");
				Integer roll = sc.nextInt();
				Student s1 = map.get(roll);
				System.out.println(s1);

			}
				break;
			case 3: { // print all entries
				Set<Entry<Integer, Student>> entries = map.entrySet();

				for (Entry<Integer, Student> e : entries) {
					System.out.println(e.getKey() + "," + e.getValue());
				}
			}
				break;
			}
		} while (choice != 0);
	}

}
