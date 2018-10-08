package com.ps.new_java.Built_inFunctionalInterfaces;

import java.util.function.Supplier;

import com.ps.new_java.Person;

public class SuppliersSample {

	public static void main(String[] args) {
		Supplier<Person> personSupplier = Person::new;
		personSupplier.get();   // new Person

	}

}
