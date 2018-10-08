package com.ps.new_java.Built_inFunctionalInterfaces;

import java.util.Comparator;

import com.ps.new_java.Person;

//Comparators are well known from older versions of Java. Java 8 adds various default methods to the interface.
public class ComparatorsSamples {
	public static void main(String... strings ) {
		Comparator<Person> comparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());

		Person p1 = new Person("John", "Doe");
		Person p2 = new Person("Alice", "Wonderland");

		System.out.println(comparator.compare(p1, p2));            // > 0
		System.out.println(comparator.reversed().compare(p1, p2)); // < 0
	}

}
