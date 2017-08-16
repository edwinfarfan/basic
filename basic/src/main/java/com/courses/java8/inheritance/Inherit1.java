package com.courses.java8.inheritance;

public class Inherit1 extends FatherClass {

	Inherit1(String s) {
		System.out.println("Inherit1");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inherit1 h = new Inherit1("s");
		
	}

	public void metodo(){
		
	}
}


class FatherClass {
	
	FatherClass () {
		System.out.println("FatherClass");
	}
	
	protected void metodo(){
		
	}
}
