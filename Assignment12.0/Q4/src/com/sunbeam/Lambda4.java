package com.sunbeam;

public class Lambda4 {
	public static <T> int countIf(T[] arr, T key, Check<T> c) {

		int count = 0;
		for (T a : arr) {
			if (c.compare(a, key)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Integer[] arr = { 22, 55, 77, 11, 66, 88, 33 };

		Integer key = 33;

		int count = countIf(arr, key, (x, y) -> x > y);
		System.out.println(count);
	}

}
