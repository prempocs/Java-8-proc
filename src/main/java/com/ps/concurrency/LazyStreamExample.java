package com.ps.concurrency;

import java.util.stream.IntStream;

public class LazyStreamExample {
	public static int multiplyByTwo(int n) {
		return n * 2;
	}

	public static void main(String[] args) {
		int firstDoubleDivBy2 = IntStream.range(1, 1000)
										 .map(LazyStreamExample::multiplyByTwo)
										 .filter(n -> n%3 == 0)
										 .findAny() 
										 .orElse(999);
		System.out.println(firstDoubleDivBy2);
	}

}
