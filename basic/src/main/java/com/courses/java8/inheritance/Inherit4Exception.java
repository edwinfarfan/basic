package com.courses.java8.inheritance;

import java.io.*;
public class Inherit4Exception {

	protected void turnon () throws IOException {
		
	}
}



class Enhirance4FileException extends Inherit4Exception {
	
	public  void turnon () throws FileNotFoundException {
		
	}
}
