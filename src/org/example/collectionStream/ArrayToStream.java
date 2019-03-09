package org.example.collectionStream;

import java.util.Arrays;
import java.util.stream.Stream;

import org.example.model.Person;

public class ArrayToStream {

	public static void main(String[] args) {

		Person[] people = {
				new Person("Mike", 20),
				new Person("Jack", 30)
		};
		
		Stream<Person> stream = Arrays.stream(people);
		Stream<Person> stream2 = Stream.of(people);
	}

}
