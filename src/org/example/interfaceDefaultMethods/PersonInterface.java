package org.example.interfaceDefaultMethods;

public interface PersonInterface {

	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);
	
	/*
	 * default public method
	 * available for any class will implement this method 
	 * ex. org.example.model.Person
	 */
	default String getPersonInfo() {
		return getName() + " (" + getAge() + ")";
	}
}
