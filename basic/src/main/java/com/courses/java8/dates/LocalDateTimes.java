package com.courses.java8.dates;

import java.time.*;

public class LocalDateTimes {

	public static void main(String arg[]){
		
		System.out.println(LocalDate.now()); 
		System.out.println(LocalTime.now()); 
		System.out.println(LocalDateTime.now());
	
		
		

	
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20); 
		System.out.println(date.getDayOfWeek()); 			 // MONDAY 
		System.out.println(date.getMonth()); 			// JANUARY 
		System.out.println(date.getYear()); 				//2020
		System.out.println(date.getDayOfYear()); 	// 20

		
		
		
		///LocalDate d = new LocalDate();  //does not compile
	
		
		LocalDate.of(2015, Month.JANUARY, 32); //error in runtime
		
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20); 
		//date1 = date1.plusMinutes(1);     // DOES NOT COMPILE the method not exist
		
	}
	
	
	
	
}
