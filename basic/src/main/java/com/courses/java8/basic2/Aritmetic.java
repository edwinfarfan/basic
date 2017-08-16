package com.courses.java8.basic2;

/**
 * Numeric Promotion Rules
1. If two values have different data types, Java will automatically promote one of the val- ues to the larger of the two data types.
2. If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value’s data type.
3. Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java binary arithmetic operator, even if neither of the operands is int.
4. After all promotion has occurred and the operands have the same data type, the result- ing value will have the same data type as its promoted operands.
 * @author edwin.farfan
 *
 */
public class Aritmetic {

	public static void main(String[] args) {
//		int x = 2 * ((5 + 3) * 4 – 8);
//		int x = 2 * (8 * 4 – 8);
//		int x = 2 * (32 – 8);
//		int x = 2 * 24;
//		x=48


		int x2 = 6;
		boolean y2 = (x2 >= 6) || (++x2 <= 7);
		System.out.println("qw"+x2);

		
		//Numeric Promotion
//		What is the data type of x * y? 
		int x = 1;
		long y = 33;
		System.out.println(x * y);// the resulting value is long.
		
		
		int v= (int)1.0;
		
		System.out.print(v);
		short y1 = (short)1921222; // is too large, Stored as 20678
		
		
		System.out.print(2147483647+1); // -2147483648 is the value, 2147483647 is the maximum int value, 
		
		
	}

}
