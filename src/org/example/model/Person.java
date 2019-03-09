package org.example.model;

import java.util.ArrayList;
import java.util.List;

import org.example.interfaceDefaultMethods.PersonInterface;

public class Person implements PersonInterface {

	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static List<Person> getPeople() {
		
		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mile", 73));

		return people;
	}
	
	/**
	 * static method
	 * compare ages
	 * @return 0 if equal
	 * @return 1 if p1 age > p2 age
	 * @return -1 if p2 age > p1 age
	 * using Integer compareTo method
	 */
	public static int compareAges(Person p1, Person p2) {
		Integer age1 = p1.getAge();
		return age1.compareTo(p2.getAge());
	}

	@Override
	public String toString() {
		return this.name + " (" + age + ")";
	}

}
