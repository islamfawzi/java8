package org.example.collectionStream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {

		Stream<String> language = Stream.of("java", "python", "node");
		
		List<String> result = language.collect(Collectors.toList());
		
        result.forEach(System.out::println);
		
	}

}
