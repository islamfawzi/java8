package org.example.interfaceStaticMethods;

import org.example.model.Person;

public interface PersonInterface {

	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);
	
	/*
	 * static public method
	 * available for any class will implement this method 
	 * ex. org.example.model.Person
	 */
	static String getPersonInfo(Person p) {
		return p.getName() + " (" + p.getAge() + ")";
	}
}
