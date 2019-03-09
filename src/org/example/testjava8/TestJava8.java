package org.example.testjava8;

public class TestJava8 {

	public static void main(String[] args) {
		
		// instance of a functional interface using lambda expression
		TestInterface tester = () -> System.out.println("Java SE 8 is working!");
		tester.test();
		
	}
}
