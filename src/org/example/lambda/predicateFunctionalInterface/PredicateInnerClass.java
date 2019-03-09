package org.example.lambda.predicateFunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

import org.example.model.Person;

public class PredicateInnerClass {

	public static void main(String[] args) {

		List<Person> people = Person.getPeople();
				
		Predicate<Person> pred = new Predicate<Person>() {
			public boolean test(Person p) {
				return p.getAge() >= 65;
			}
		};
		
		for (Person person : people) {
			if(pred.test(person)){
				System.out.println(person.toString());
			}
		}

	}

}
