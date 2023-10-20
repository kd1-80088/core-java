package com.sunbeam;

import java.util.function.Predicate;

public class Lambda1 {

	public static void countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for (String s : arr) {
			if (cond.test(s)) {
				count++;
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		String[] arr = { "Pranav", "Chaitanya", "Omkar", "Pratik", "Indrajit", "Saurabh" };

		countIf(arr, s -> s.length() > 6);

	}

}
