package com.courses.java8.methods;

import java.util.List;
import static java.util.Arrays.asList;

public class StaticImports {
	public static void main(String[] args) {
		List<String> list = asList("one", "two");
	}
}




import static statics.A.TYPE;
import static statics.B.TYPE; // DOES NOT COMPILE