package com.courses.java8.methods;

public class LegalMethods {

	
	public void walk1() {}
	
	public final void walk2() {}
	
	public static final void walk3() {}
	
	public final static void walk4() {}
	
	public modifier void walk5() {} 			// DOES NOT COMPILE 
	
	public void final walk6() {} 				// DOES NOT COMPILE 
	
	final public void walk7() {}
	
	//// Return type::
	
	public void walk10() { }
	public void walk20() { return; }
	public String walk30() { return ""; }
	public String walk40() { } // DOES NOT COMPILE
	public walk50() { } // DOES NOT COMPILE
	String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE
	
	
	

	//Method Names:
	
	public void walk100() { }
	public void 2walk() { } // DOES NOT COMPILE 
	public walk3 void() { } // DOES NOT COMPILE 
	public void Walk_$() { }
	public void() { } // DOES NOT COMPILE
	
	

	//Parameter list
	
	public void walk1000() { }
	public void walk2000 { } 	// DOES NOT COMPILE
	public void walk3000(int a) { }
	public void walk4000(int a; int b) { } // DOES NOT COMPILE 
	public void walk5000(int a, int b) { }
	
	
	
	
			
}
