package com.courses.java8.inheritance;

public class Inherit7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Enhirance7B b = Enhirance7B.Enhirance7B("Test");
		
	}

}

class Enhirance7B {
	private Enhirance7B() {
		
	}
	static Enhirance7B Enhirance7B (String s){
		//System.out.println(s); // todo: not present
		return new Enhirance7B();
	}
}