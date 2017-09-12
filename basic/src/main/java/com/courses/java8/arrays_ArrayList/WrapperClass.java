package com.courses.java8.arrays_ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		boolean boolean1 = Boolean.parseBoolean("true");
		Boolean booleanWrapper = Boolean.valueOf("true");

		byte byte1 = Byte.parseByte("1");
		Byte byteWrapper = Byte.valueOf("2");

		short short1 = Short.parseShort("1");
		Short shortWrapper = Short.valueOf("2");

		int int1 = Integer.parseInt("1");
		Integer integerWrapper = Integer.valueOf("2");
		
		System.out.println(short1);

		long long1 = Long.parseLong("1");
		Long longWrapper = Long.valueOf("2");

		float float1 = Float.parseFloat("1");
		Float floatWrapper = Float.valueOf("2.2");

		double double1 = Double.parseDouble("1");
		Double doubleWrapper = Double.valueOf("2.2");
		
		
		
		
		Boolean boolObj2 = new Boolean("TrUe"); 
		Boolean boolObj3 = new Boolean("XX"); 
		Integer intObj2 = new Integer("2014");
		Double doubleObj2 = new Double("3.14");
		Long longObj1 = new Long("3.14"); 

	}

}
