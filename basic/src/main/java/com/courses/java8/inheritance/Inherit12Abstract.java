package com.courses.java8.inheritance;

import java.io.IOException;

public class Inherit12Abstract {

	public static void main (String[] agrs) throws IOException  {
		new Inherit12E().x(23);
	}
}

class Inherit12B {
	void x (int i) throws IOException{
		System.out.println("c");
	}
}

abstract class Inherit12C extends Inherit12B {
	abstract void x (int i) throws IOException;
}

abstract class Inherit12D extends Inherit12C {
	 void x (int i) throws IOException{
		 System.out.println("d");
	 }
}

 class Inherit12E extends Inherit12D{
	
}

