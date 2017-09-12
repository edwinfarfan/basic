package com.courses.java8.methods;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
		
		//Prior Java 8 : 

		for (String feature : features) 
		{ 	
			System.out.println(feature); 
		} 
		
		//In Java 8: 
	
		features.forEach(n -> System.out.println(n));

	}

}
