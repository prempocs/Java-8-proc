package com.ps.tupple;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.KeyValue;
import org.javatuples.Pair;
import org.javatuples.Triplet;
import org.javatuples.Unit;

/**
 * 
 * @author PremRohan They are Typesafe They are Immutable They are Iterable They
 *         are Serializable They are Comparable (implements Comparable<Tuple>)
 *         They implement equals() and hashCode() They also implement toString()
 */
public class JavaTuppleSample {

	public static void main(String[] args) {
		/*
		 * For 1 element - Unit<A> For 2 elements - Pair<A, B> For 3 elements -
		 * Triplet<A, B, C> For 4 elements - Quartet<A, B, C, D> For 5 elements -
		 * Quintet<A, B, C, D, E> For 6 elements - Sextet<A, B, C, D, E, F> For 7
		 * elements - Septet<A, B, C, D, E, F, G> For 8 elements - Octet<A, B, C, D, E,
		 * F, G, H> For 9 elements - Ennead<A, B, C, D, E, F, G, H, I> For 10 elements -
		 * Decade<A, B, C, D, E, F, G, H, I, J>
		 */

		Unit<String> unit = new Unit<String>("GeeksforGeeks");
		Pair<String, String> pair = new Pair<String, String>("A", "B");
		Triplet<String, String, String> triplet = new Triplet<String, String, String>("A", "B", "C");

		System.out.println(unit);
		unit = Unit.with("GeeksforGeeks");
		System.out.println(unit);
		List<String> list = new ArrayList<String>(); 
        list.add("GeeksforGeeks"); 
        unit = Unit.fromCollection(list); 
		System.out.println(unit);
        // Creating Unit from Array 
        String[] arr = { "A computer portal" }; 
        unit = Unit.fromArray(arr); 
		System.out.println(unit);
        unit = unit.setAt0("GeeksforGeeks");
		System.out.println(unit);
		pair = unit.addAt1("A computer portal"); 
		System.out.println(pair); 
		
		boolean exist = unit.contains("GeeksforGeeks"); 
        boolean exist1 = unit.contains(4); 
  
        System.out.println(exist); 
        System.out.println(exist1); 
        for (Object item : unit) 
            System.out.println(item); 
		
       unit =  pair.removeFrom1();
		
     
		KeyValue<Integer, String> keyValue = new KeyValue<Integer, String>(1, "MyData");
		keyValue.forEach(System.out::println);
		
		
		
		System.out.println(pair.getSize());
		System.out.println(triplet.getSize());
	}
}
