package org.example.interfaceDefaultMethods;

import java.util.List;

import org.example.model.Person;

public class UseDefaultMethod {

	public static void main(String[] args) {
		
		List<Person> people = Person.getPeople();
		
		people.forEach(p -> {
			
			/*
			 *  call the defualt method 
			 *  declared in PersonInterface parent of Person 
			 */
			
			System.out.println(p.getPersonInfo());
		});
	}
}
