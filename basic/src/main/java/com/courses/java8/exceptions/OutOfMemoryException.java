package com.courses.java8.exceptions;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> objetos = new ArrayList<String>();
		String actual = "";
		while (true) {
			actual += "Otro Objeto..";
			objetos.add(actual);
		}

	}

}
