package org.example.interfaceStaticMethods;

import java.util.List;

import org.example.model.Person;

public class UseStaticMethod {

	public static void main(String[] args) {

		List<Person> people = Person.getPeople();
		
		people.forEach(p -> {
			
			/*
			 *  call the static method 
			 *  declared in PersonInterface parent of Person 
			 */
			
			System.out.println(PersonInterface.getPersonInfo(p));
		});
		
	}

}
