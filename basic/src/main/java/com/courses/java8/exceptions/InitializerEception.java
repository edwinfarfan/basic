package com.courses.java8.exceptions;

public class InitializerEception {

//	static {
//		if (true) {
//			throw new RuntimeException ("Lanzar el Runtime exception...");
//		}
//	}
	
	static int a = Integer.parseInt("a");  //throws  ExceptionInInitializerError then numberformatException
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new InitializerEception();
	}

}
