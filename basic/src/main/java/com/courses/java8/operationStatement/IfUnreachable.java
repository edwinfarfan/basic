package com.courses.java8.operationStatement;

public class IfUnreachable {

	public static void main(String[] args) {
		
		int hourOfDay = 16;
		
		if(hourOfDay < 15) { 
			System.out.println("Good Afternoon");
		} else if(hourOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE
		} else {
			System.out.println("Good Evening");
		}

	}
}
