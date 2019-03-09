package org.example.lambda.functionlInterfaces;

public class UseSimpleInterface {

	public static void main(String[] args) {

		SimpleInterface obj = () -> System.out.println("Say something");
		obj.doSomething();
	}

}
