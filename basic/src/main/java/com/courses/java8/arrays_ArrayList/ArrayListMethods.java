package com.courses.java8.arrays_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); 						// [hawk]
		birds.add("hawk"); 						// [hawk, hawk]
		
		//Arraylist allow null as record
		birds.add(null); 
		System.out.println("size:::"+ birds.size()); 
		
		System.out.println(birds.isEmpty()); 	// false
		System.out.println(birds.size()); 		// 2
		birds.clear(); 							// []
		System.out.println(birds.isEmpty()); 	// true
		System.out.println(birds.size());		// 0
		
		System.out.println(birds.contains("hawk")); // true 
		System.out.println(birds.contains("robin")); // false
		
	
		equalMethod();
	}
	
	
	private static void equalMethod() {
		
		List<String> one = new ArrayList<>(); 
		List<String> two = new ArrayList<>(); 
		
		System.out.println(one.equals(two)); // true
		one.add("a");// [a]

		System.out.println(one.equals(two)); // false 
		two.add("a"); // [a]

		System.out.println(one.equals(two)); // true
		one.add("b");// [a,b]

		two.add(0, "b"); // [b,a]

		System.out.println(one.equals(two)); // false

	}

}
