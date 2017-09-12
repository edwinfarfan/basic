package com.courses.java8.methods;

public class PassValue {

	public static void main(String[] args) {
	
		Integer original1 = 1;
		Integer original2 = 2;
		swap(original1, original2); 
		System.out.println(original1); 		//1
		System.out.println(original2);		//2
	}
	public static void swap(int a, int b) {
		int temp = a; 
		a = b;
		b = temp;
		System.out.println(a);  // 2
		System.out.println(b);	//1

	}

}
