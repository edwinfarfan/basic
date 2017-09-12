package com.courses.java8.strings;

public class StringEquals {

	public static void main(String[] args) {
//		System.out.println("abc".equals("ABC")); 
//		System.out.println("ABC".equals("ABC")); 
//		System.out.println("abc".equalsIgnoreCase("ABC")); 

		
		
		String cadena1 = new String ("A");
		String cadena2 = new String ("A");
		String cadena3 =cadena1.concat("2");
		
		String cadena4 =new String("A2");
		
		
		if(cadena1.equals(cadena2)){
			System.out.println("la cadena es igual");
		}
		
		if(cadena4 == cadena3 ){
			System.out.println("la cadena es igual2");
		}
		

	}

}
