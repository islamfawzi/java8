package org.example.methodReferences;

import java.util.Collections;
import java.util.List;

import org.example.model.Person;

public class StaticMethidReference {

	public static void main(String[] args) {

		List<Person> people = Person.getPeople();
		
		/*
		 * use static method refernce
		 *  sort method expect intnce of comparator interface
		 *  which has single abstract method expect 2 values
		 *  compareAges expect 2 values and comparing them
		 */
		Collections.sort(people, Person::compareAges);
//		people.forEach(p -> System.out.println(p) );
		people.forEach(System.out::println);
		
	}

}
