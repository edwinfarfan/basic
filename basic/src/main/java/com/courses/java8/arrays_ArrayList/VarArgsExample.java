package com.courses.java8.arrays_ArrayList;

public class VarArgsExample {

	

	public void walk1(int... nums) { }
	
	public void walk2(int start, int... nums) { }
	
	//the varargs must be the last
	//public void walk3(int... nums, int start) { } // DOES NOT COMPILE
	
	//must be only one varargs
	//public void walk4(int... start, int... nums) { } // DOES NOT COMPILE

	//public void walk4(String... start, int... nums) { }
	
}
