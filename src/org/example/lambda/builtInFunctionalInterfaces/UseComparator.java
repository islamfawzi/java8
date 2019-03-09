package org.example.lambda.builtInFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");

		// simple case-sensitive sort operation
		Collections.sort(strings);
		for (String str : strings) {
			System.out.println(str);
		}

		//////////////////////////////////////////////////////////////
		
		
		// case-insensitive sort with an Comparator anonymous class
		Collections.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return str1.compareToIgnoreCase(str2);
			}
		});
		
		System.out.println("Sort with Comparator anonymous class");
		for (String str : strings) {
			System.out.println(str);
		}
		
		////////////////////////////////////////////////////////////
		
		// case-insensitive sort with an Comparator functional interface and lambda expression
		Comparator<String> comparator = (str1, str2) -> 
		{ 
			return str1.compareToIgnoreCase(str2); 
		};
		
		Collections.sort(strings, comparator);
		
		System.out.println("Sort with Comparator functional interface and lambda expression");
		for (String str : strings) {
			System.out.println(str);
		}
		
		System.out.println("================================");
		
		Collections.sort(strings, (str1, str2) -> {
			return str1.compareToIgnoreCase(str2);
		});
		
		for (String str : strings) {
			System.out.println(str);
		}
	}

}