package org.example.methodReferences;

import java.util.Collections;
import java.util.List;

import org.example.model.Person;

public class InstanceMethodReference {

	public static void main(String[] args) {
		
		new InstanceMethodReference().sortData();
		
	}
	
	public void sortData() {
		
		List<Person> people = Person.getPeople();
		
		/*
		 * using instance method
		 */
		Collections.sort(people, this :: compareAges);
//		people.forEach(p -> System.out.println(p) );
		people.forEach(System.out::println);
	}
	
	/**
	 * instance method
	 * compare ages
	 * @return 0 if equal
	 * @return 1 if p1 age > p2 age
	 * @return -1 if p2 age > p1 age
	 * using Integer compareTo method
	 */
	public int compareAges(Person p1, Person p2) {
		Integer age1 = p1.getAge();
		return age1.compareTo(p2.getAge());
	}
	
	
}
