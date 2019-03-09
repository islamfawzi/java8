package org.example.StringJoiner;

/** Implode **/
public class JoiningStrings {

	public static void main(String[] args) {

		// you can add many arguments as you want
		String stoogs = String.join(" and ", "Larry", "Curly", "Moe");
		System.out.println(stoogs);
		
		
		String[] states = {"California", "Oregen", "Washington"};
		String statesList = String.join(", ", states);
		System.out.println(statesList);
		
	}

}
