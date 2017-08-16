package com.courses.java8.inheritance;

public class Inherit8 extends Inherit8B{

	Inherit8 (String s){
		//this.s = s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}

class Inherit8B {
	private String s;
	protected  Inherit8B() {
		
	}
	static Inherit8 Inherit8B(String s){
		//return new Inherit8();   ///no compila
		return null;
	}
}