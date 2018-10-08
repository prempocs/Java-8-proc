package com.ps.new_java.streams;

import java.util.List;
import java.util.Optional;

public class FilterSample {
	//Filter accepts a predicate to filter all elements of the stream. This operation is intermediate which enables us to call another stream operation (forEach) on the result. 
	//ForEach accepts a consumer to be executed for each element in the filtered stream. 
	//ForEach is a terminal operation. It's void, so we cannot call another stream operation.
	public static void main(String[] args) {
		MyStreamInterface msi = new MyStreamInterface() {
		};
		List<String> stringCollection = msi.myStringCollection();
        
		stringCollection.stream().filter((s)-> s.startsWith("a")).forEach(System.out::println);
		//Sorted#
		//Sorted is an intermediate operation which returns a sorted view of the stream. The elements are sorted in natural order unless you pass a custom Comparator.
		stringCollection.stream().sorted().filter((s)-> s.startsWith("a")).forEach(System.out::println);
		//Keep in mind that sorted does only create a sorted view of the stream without manipulating the ordering of the backed collection. The ordering of stringCollection is untouched:
		System.out.println(stringCollection);
		
		//Map#
		//The intermediate operation map converts each element into another object via the given function. The following example converts each string into an upper-cased string. But you can also use map to transform each object into another type. The generic type of the resulting stream depends on the generic type of the function you pass to map.
		stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
		//Match#
		//Various matching operations can be used to check whether a certain predicate matches the stream. All of those operations are terminal and return a boolean result.
		boolean anyStartsWithA =
			    stringCollection
			        .stream()
			        .anyMatch((s) -> s.startsWith("a"));

			System.out.println(anyStartsWithA);      // true

			boolean allStartsWithA =
			    stringCollection
			        .stream()
			        .allMatch((s) -> s.startsWith("a"));

			System.out.println(allStartsWithA);      // false

			boolean noneStartsWithZ =
			    stringCollection
			        .stream()
			        .noneMatch((s) -> s.startsWith("z"));

			System.out.println(noneStartsWithZ);      // true
			
			//Count#
			//Count is a terminal operation returning the number of elements in the stream as a long.
			long startsWithB =
			    stringCollection
			        .stream()
			        .filter((s) -> s.startsWith("b"))
			        .count();

			System.out.println(startsWithB);    // 3
			//Reduce#
			//This terminal operation performs a reduction on the elements of the stream with the given function. The result is an Optional holding the reduced value.
			Optional<String> reduced =
			    stringCollection
			        .stream()
			        .sorted()
			        .reduce((s1, s2) -> s1 + "#" + s2);

			reduced.ifPresent(System.out::println);
			// "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"
			
			
	}

}
