package com.courses.java8.methods;

public class LegalOverloadMethod {

	// These are all valid overloaded methods:
	public void fly(int numMiles) { }
	public void fly(short numFeet) { }
	public boolean fly() { return false; }
	void fly(int numMiles, short numFeet) { }
	public void fly(short numFeet, int numMiles) throws Exception { }
	
	
	public void fly(Integer numMiles) { }
	
	
	
		
}
