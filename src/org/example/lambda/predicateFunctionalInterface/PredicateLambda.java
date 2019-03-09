package org.example.lambda.predicateFunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

import org.example.model.Person;

public class PredicateLambda {

	public static void main(String[] args) {
		
		List<Person> people = Person.getPeople();		
				
		Predicate<Person> predOlder = (p) ->  p.getAge() >= 65;
		Predicate<Person> predYounger = (p) -> p.getAge() <= 40;

		getPeople(people, predOlder);
		getPeople(people, predYounger);
				
	}

	private static void getPeople(List<Person> people, Predicate<Person> pred) {
		
		people.forEach(p -> {
			if(pred.test(p)){
				System.out.println(p);
			}
		});
	}
}
