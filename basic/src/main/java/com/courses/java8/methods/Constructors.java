package com.courses.java8.methods;

public class Constructors {

	private static final String var="one";

	public Constructors() {
		super();
		
		String variable = var+"two";
		
		System.out.println(variable);
		
	}

	public static void main(String[] args) {

		Constructors c =new Constructors();
		
		
	}

}
