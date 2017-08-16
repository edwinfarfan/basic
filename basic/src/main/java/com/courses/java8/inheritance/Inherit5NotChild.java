package com.courses.java8.inheritance;

public class Inherit5NotChild extends B{

	int m (String s ){
		return 3;
	}
	public static void main(String[] args) {
	
		System.out.println(new C().m(3));

	}
	
}

 class B extends C {
	 int m (int s ){
			return 1;
		}
}
 
 class C //extends Enhirance5Polimorfismo {  /// no se puede hereda de su clase hija
 {
	 int m (double s ){
			return 3;
	}
 }