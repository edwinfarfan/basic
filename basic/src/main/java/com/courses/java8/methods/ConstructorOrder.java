package com.courses.java8.methods;

public class ConstructorOrder {

	private String name = "aaa"; 
	{ 
      System.out.println(name); 
	} 
	private static int COUNT = 0; 
	static { 
      System.out.println(COUNT); 
	} 
	{ 
      COUNT++;  
      System.out.println(COUNT); 
	} 
	   
	public ConstructorOrder() {
		System.out.println("constructor"); 
	}

	public static void main(String[] args) {
		System.out.println("read to construct"); 
	      new ConstructorOrder(); 
	}

}
