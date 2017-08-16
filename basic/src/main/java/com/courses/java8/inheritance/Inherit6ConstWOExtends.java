package com.courses.java8.inheritance;

public class Inherit6ConstWOExtends {

	public static void main (String s[]) {
	
		Enhirance6ConstB b = Enhirance6ConstB.Enhirance5ConstB("Test");
	}
	
}


class Enhirance6ConstB {

	private Enhirance6ConstB() {}
	
	static Enhirance6ConstB Enhirance5ConstB (String s ){
		return new Enhirance6ConstB();
	}
}