package com.courses.java8.exceptions;

import java.io.IOException;


public class OrderCatchException {

public static void main(String[] args) {
		
	OrderCatchException c = new OrderCatchException();
	try {
		c.method2();
	} catch (IOException ex ) {
		System.out.println("3");
	} catch (Exception ex ) {
		System.out.println("3");
	} catch (RuntimeException ex ) {  // runtime is menor que exception
		System.out.println("3");
	}
		
	}

	private void method2() throws IOException{
		
		System.out.println("3");
		System.in.read();
		System.out.println("4");
		
	}

}
