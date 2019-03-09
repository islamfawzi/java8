package org.example.collectionStream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import org.example.model.Person;

public class StreamAggregation {

	public static void main(String[] args) {

		List<Person> people = Person.getPeople();
		
		// sum
		int sum = people.parallelStream()
				.mapToInt(p -> p.getAge())
				.sum();
		
		System.out.println("Ages sum: " + sum);
		
		// Average
		// return optional coz it may devide by zero
		OptionalDouble avgOptional = people.parallelStream()
				.mapToInt(Person::getAge)
				.average();
		
		if(avgOptional.isPresent())
			System.out.println("Ages average: " + avgOptional.getAsDouble());
		
		
		// Min
	    OptionalInt min = people.parallelStream()
	    		.mapToInt(Person::getAge)
	    		.min();
	    
	    if(min.isPresent())
	    	System.out.println("Ages min " + min.getAsInt());
	    
		
	    // Max
	    OptionalInt max = people.parallelStream()
	    		.mapToInt(Person::getAge)
	    		.max();
	    
	    if(max.isPresent())
	    	System.out.println("Ages max " + max.getAsInt());
	    
	}

}
