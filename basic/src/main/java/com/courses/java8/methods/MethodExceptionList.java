package com.courses.java8.methods;

public class MethodExceptionList {

	public void zeroExceptions() { }
	
	public void woException() throw IllegalArgumentException { } 
	
	public void oneException() throws IllegalArgumentException { } 
	
	
	public void twoExceptions() throws IllegalArgumentException, InterruptedException { }
	
}
