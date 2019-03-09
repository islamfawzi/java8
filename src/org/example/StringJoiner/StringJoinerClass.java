package org.example.StringJoiner;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass {

	public static void main(String[] args) {

		/** Create StringJoiner **/
		
		StringJoiner sj = new StringJoiner(",", "{", "}");
		
		/** without prefix and suffix and delimiter **/
		
		sj.setEmptyValue("not stooges yet");
		
		System.out.println(sj);
		 
		/** with prefix and suffix and delimiter **/
		
		sj.add("Moe")
		  .add("Larry")
		  .add("Curly");
		
		System.out.println(sj);
		
		
		/** Merging StringJoiner instances **/
		
		StringJoiner sj2 = new StringJoiner("|");
		sj2.add("Shemp");
		
//		sj.merge(sj2);
//		System.out.println(sj);
		
		sj2.merge(sj);
		System.out.println(sj2);
		
		
		/** Working with Collection **/
		Set<String> set = new TreeSet<>();
		set.add("California");
		set.add("Oregen");
		set.add("Washington");
		
		StringJoiner sj3 = new StringJoiner(" and ");
		set.forEach(s -> sj3.add(s));
		
		System.out.println(sj3);
		
		
	}

}
