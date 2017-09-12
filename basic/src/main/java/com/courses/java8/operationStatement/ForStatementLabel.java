package com.courses.java8.operationStatement;

import java.util.*;
public class ForStatementLabel {

	public static void main(String[] args) {
		FIRST_CHAR_LOOP: 
		for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.print(" " + a + x);
			}
		}

	}

}



enum TestEnum {
	
	ONE("uno", 1), TWO ("dos",2), THREE ("tres",3);
	
	private String name;
	
	TestEnum (String name, int index){
		this.name = name;
	}
	
}