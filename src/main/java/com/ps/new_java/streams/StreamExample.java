package com.ps.new_java.streams;

import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		System.out.println(Stream.of("Prem","sahil").findFirst());
		 Stream.generate(Math::random).limit(11).forEach(System.out::println);

	}

}
