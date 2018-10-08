package com.ps.new_java.streams;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author PremRohan
 * 
 * A java.util.Stream represents a sequence of elements on which one or more operations can be performed. 
 * Stream operations are either intermediate or terminal. While terminal operations return a result of a certain type, intermediate operations return the stream itself so you can chain multiple method calls in a row. Streams are created on a source, e.g. a java.util.Collection like lists or sets (maps are not supported). Stream operations can either be executed sequential or parallel.
 * Let's first look how sequential streams work. First we create a sample source in form of a list of strings:
 */
public interface MyStreamInterface {
	default List<String> myStringCollection (){
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
		return stringCollection;
	}
}
//Collections in Java 8 are extended so you can simply create streams either by calling Collection.stream() or Collection.parallelStream(). The following sections explain the most common stream operations.