package com.courses.java8.arrays_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<>(); 
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		numbers.add(100);
		Collections.sort(numbers); 
		System.out.println(numbers); //[5, 81, 99,100]
		
				

	}
	
	
}
