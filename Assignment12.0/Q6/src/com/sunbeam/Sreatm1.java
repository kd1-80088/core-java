package com.sunbeam;

import java.util.*;
import java.util.stream.Stream;

public class Sreatm1 {

	public static void main(String[] args) {
//		List<Integer> arr = new ArrayList<>();
//
//		Collections.addAll(arr, 1, 2, 3, 4, 5);
//		Stream<Integer> strm = arr.stream();
//
//		Integer sum = strm.reduce(1, (a, b) -> a * b);
//
//		System.out.println(sum);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number");
		int num = sc.nextInt();

		Stream<Integer> strm = Stream.iterate(1, x -> x + 1).limit(num);

		int result = strm.reduce(1, (a, b) -> a * b);
		System.out.println(result);

	}

}
