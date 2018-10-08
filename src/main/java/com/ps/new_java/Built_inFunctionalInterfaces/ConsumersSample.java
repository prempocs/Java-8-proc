package com.ps.new_java.Built_inFunctionalInterfaces;

import java.util.function.Consumer;

import com.ps.new_java.Person;

public class ConsumersSample {

	public static void main(String[] args) {
		Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.getFirstName());
		greeter.accept(new Person("Luke", "Skywalker"));

	}

}
