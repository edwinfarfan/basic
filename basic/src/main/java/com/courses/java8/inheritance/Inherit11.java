package com.courses.java8.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Inherit11 {

	public static void main (String[] agrs) throws FileNotFoundException  {
		
			new C1().x();
		
	}
}

class B1 {
	void x () throws IOException{
		System.out.println("c");
	}
}
class C1 extends B1{
	void x () throws FileNotFoundException{
		System.out.println("b");
	}
}