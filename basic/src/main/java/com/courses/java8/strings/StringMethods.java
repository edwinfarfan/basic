package com.courses.java8.strings;

public class StringMethods {

	public static void main(String[] args) {
		

		String cadena= "animals";
		
		
		System.out.println(cadena.indexOf("al",7));

		System.out.println(cadena.substring(1, 3));
		
		String cadena1= new String("A");
		String cadena2= new String ("A");
		
		if(cadena1==cadena2){
			System.out.println("true");
		}
		
		System.out.println(cadena1.equals(cadena2));
	}

}
