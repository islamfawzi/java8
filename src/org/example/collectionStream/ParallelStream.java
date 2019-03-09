package org.example.collectionStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.model.Person;

/**
 * break up processing on multiple CPUs
 * not sorted 
 */

public class ParallelStream {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>();
		for (int i = 0; i < 10000;  i++) {
			strings.add("Item " + i);
		}
		 		
		
		strings.stream()
		.parallel()
		.forEach(System.out::println);
		
	}

}
