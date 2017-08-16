package com.courses.java8.inheritance;

public class Inherit10StaticMethod extends A {

	public void method() {
		System.out.print("b");
		super.method();
		
	}
	
	public void method2 (){
		System.out.print("c");
		method();
		super.method();
		super.method2();
	}
	
	public static void main(String[] args) {

		new Inherit10StaticMethod().method2();
		
		
	}

}

class A  {
	
	public void method() {
		System.out.print("a");
	}
	
	public void method2 (){
		System.out.print("parent method2");
	}
}
