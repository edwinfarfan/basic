package com.courses.java8.methods;

public class ConstructorAutoboxing {

	ConstructorAutoboxing() { 
     System.out.print("1 "); 
   } 
	ConstructorAutoboxing(int num) { 
     System.out.print("2 "); 
   } 
	ConstructorAutoboxing(Integer num) { 
     System.out.print("3 "); 
   } 
	ConstructorAutoboxing(Object num) { 
     System.out.print("4 "); 
   } 
	ConstructorAutoboxing(int... nums) { 
     System.out.print("5 "); 
   } 
   public static void main(String[] args) { 
     new ConstructorAutoboxing(1); 
     new ConstructorAutoboxing(1L); 
   } 

}
