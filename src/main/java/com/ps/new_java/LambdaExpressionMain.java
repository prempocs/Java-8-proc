package com.ps.new_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionMain {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		/**
		 * The static utility method Collections.sort accepts a list and a comparator in order to sort the elements of the given list. 
		 * You often find yourself creating anonymous comparators and pass them to the sort method.
		 */
		Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		        return b.compareTo(a);
		    }
		});
		//Instead of creating anonymous objects all day long, Java 8 comes with a much shorter syntax, lambda expressions:
		Collections.sort(names, (String a, String b) -> {
		    return b.compareTo(a);
		});
		//For one line method bodies you can skip both the braces {} and the return keyword. But it gets even more shorter:
		Collections.sort(names, (String a, String b) -> b.compareTo(a));
		
		//The java compiler is aware of the parameter types so you can skip them as well. Let's dive deeper into how lambda expressions can be used in the wild.
		List<Integer> numbers = Arrays.asList(1,4,2,6,11,89);
		Collections.sort(numbers, (a, b) -> b.compareTo(a));

	}

}
