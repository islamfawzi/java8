package org.example.collectionStream;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.example.model.Person;

public class SequentialStream {

	public static void main(String[] args) {

		List<Person> people = Person.getPeople();
		
		Predicate<Person> pred = (p) -> p.getAge() > 65;
		
		System.out.println("Print All:");
		people.stream().forEach(p -> System.out.println(p.getName()));
		
		System.out.println("===================");

		System.out.println("Use Stream Filter:");
		people.stream()
		.filter(pred)
		.forEach(System.out::println);
		
		System.out.println("===================");
		
		boolean allMatch = people.stream().allMatch(pred);
		boolean anyMath = people.stream().anyMatch(pred);
		Stream<Person> distinct = people.stream().distinct();
		long count = people.stream().count();
		Optional<Person> findAny = people.stream().findAny();
		Optional<Person> findFirst = people.stream().findFirst();
		
		
		
		
		
	}

}
