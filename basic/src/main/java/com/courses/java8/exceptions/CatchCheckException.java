package com.courses.java8.exceptions;

import java.io.IOException;

public class CatchCheckException {

	public static void main(String[] args) {
		
		CatchCheckException c = new CatchCheckException();
		c.method1();
	}

	private void method1(){
		try {
			System.out.println("1");
			method2();
			System.out.println("2");	
		}catch (IOException ex) {
			System.out.println("2 exception..");	
		}
		
	}

	private void method2() throws IOException{
		
		System.out.println("3");
		System.in.read();
		System.out.println("4");
		
	}
}
