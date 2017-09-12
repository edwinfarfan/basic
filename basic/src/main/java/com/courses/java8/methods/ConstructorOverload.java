package com.courses.java8.methods;

public class ConstructorOverload {
	private String color; 
	private int weight;

	public ConstructorOverload(int weight) {               // first constructor 
	    //this.weight = weight; 
	    color = "brown"; 
	    System.out.println("in constructor"); 
	       // ready to call this 
	    this(weight, "brown");     ///Constructor call must be the first statement in a constructor
	  } 
	
	  public ConstructorOverload(int weight, String color) {     // second constructor 
	   this.weight = weight; 
	   this.color = color; 
	  } 

}
