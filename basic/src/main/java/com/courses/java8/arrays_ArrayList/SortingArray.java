package com.courses.java8.arrays_ArrayList;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {99,5,100 ,81};
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print (numbers[i] + " ");
		
		
		
		System.out.println( " ");
		
		
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String string : strings)
			System.out.print(string + " ");

		
		
	}

}
