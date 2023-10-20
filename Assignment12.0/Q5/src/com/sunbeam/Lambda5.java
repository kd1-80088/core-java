package com.sunbeam;

public class Lambda5 {
	public static <T> void countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T d : arr) {
			if (c.compare(d, key)) {
				count++;
			}
		}
		System.out.println("Count -- " + count);
	}

	public static void main(String[] args) {

		Double[] arr = { 22.0, 33.0, 22.0, 55.0, 44.0, 66.0, 55.0, 55.0, 77.0 };

		Double key = 55.0;

		countIf(arr, key, (element, k) -> element.equals(k));

	}

}
