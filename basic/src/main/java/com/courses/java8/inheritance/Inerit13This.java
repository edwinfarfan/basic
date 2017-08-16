package com.courses.java8.inheritance;

import java.io.IOException;

public class Inerit13This {

	public static void main(String[] args) throws IOException {
		
		new Inerit13ThisE().x(32);
	}

}

class Inerit13ThisB {
	void x(int i ) throws IOException {
		if (i<0) return;
		this.x(-1);
		System.out.println ("C");
	}
}

abstract class Inerit13ThisC extends Inerit13ThisB {
	void x(int i ) throws IOException {
		
		System.out.println ("b");
		super.x(i);	
	}
}

abstract class Inerit13ThisD extends Inerit13ThisC {
	void x(int i ) throws IOException {
		super.x(i);
	}
}
class Inerit13ThisE extends Inerit13ThisD{
	
}
