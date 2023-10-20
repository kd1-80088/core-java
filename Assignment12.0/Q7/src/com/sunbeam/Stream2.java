package com.sunbeam;

import java.util.*;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {

//		Set<Integer> set = new HashSet<>();
//
//		Collections.addAll(set, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//		Stream<Integer> strm = set.stream();
//		Integer sum = strm.reduce(0, (a, b) -> a + b);
//		System.out.println(sum);

		Random random = new Random();
		Stream<Integer> strm = Stream.generate(() -> random.nextInt(10)).limit(10);

		Stream<Integer> strm1 = Stream.generate(() -> random.nextInt(10)).distinct().limit(10);

		int result = strm1.reduce(0, (a, b) -> a + b);
		System.out.println("Result = " + result);

	}

}
