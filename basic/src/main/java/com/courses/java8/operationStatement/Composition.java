package com.courses.java8.operationStatement;

import java.math.BigInteger;

public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer.pago();
	}
}


class Employee{  
	BigInteger salary = new BigInteger("2000");  
}  
class Programmer extends Employee{  
	int bonus=1000;  
	public static void pago(){  
		Programmer p=new Programmer();  
		System.out.println("Programmer salary is:"+p.salary);  
		System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
}  
