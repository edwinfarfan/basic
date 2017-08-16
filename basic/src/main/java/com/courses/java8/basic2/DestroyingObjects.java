package com.courses.java8.basic2;

public class DestroyingObjects {

	public static void main(String[] args) {
		
		String one, two;
		one = new String("a"); //one=a
		two = new String("b"); ///two=b
		one = two;
		String three = one; //one, two, three = b
		one = null;
	}

}
