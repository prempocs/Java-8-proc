package com.ps.new_java;

public class Person {
    String firstName;
    String lastName;

    public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}