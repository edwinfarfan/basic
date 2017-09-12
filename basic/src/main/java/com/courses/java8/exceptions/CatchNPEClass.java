package com.courses.java8.exceptions;

public class CatchNPEClass {

	public static void main(String[] args) {

		String name = null;
		//if the name is not initialized, then the class doesn't not compile.
		//String name ;
		try {
			name.toLowerCase();
			System.out.println("a");
		}catch (NullPointerException ex) {
			System.out.println("b");
		}finally {
			System.out.println("finally");
				
		}
		System.out.println("c");
		
	}

}
