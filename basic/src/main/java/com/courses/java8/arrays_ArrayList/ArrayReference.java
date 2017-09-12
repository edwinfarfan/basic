package com.courses.java8.arrays_ArrayList;

public class ArrayReference {

	public static void main(String[] args) {
		
		String[] names = { "Jhon", "Louis", "James" };
		String[] lastnames = { "Jhon", "Louis", "James" };
		String[] alias = names;

		System.out.println(names.equals(lastnames)); 

		System.out.println(names.equals(alias)); 

		System.out.println(names.toString()); 
		
		
	}

}
