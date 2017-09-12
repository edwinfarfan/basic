package com.courses.java8.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JerarquiasExceptions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("a");
		
		new JerarquiasExceptions().method1();
		System.out.println("b");
	}
	
	
	void method1 () throws FileNotFoundException  {
		System.out.println("c");
		try {
			method2();
		}catch (FileNotFoundException fe){
			//tratamiento de la exception.
		}
		
		System.out.println("d");
	}
	
	void method2 () throws FileNotFoundException {
		System.out.println("f");
//		new FileInputStream("a.text");///trow exception FileNotFoundException
		if (true)
		throw new NullPointerException();
		System.out.println("g");
		
	}

}
