package com.courses.java8.exceptions;

public class NoCatchUncheckException {

	public static void main(String[] args) {
		NoCatchUncheckException nocatch = new NoCatchUncheckException();
		//nocatch.method1();
		//nocatch.method3();
		
		
		int [] i = new int[15];
		
		i[20]=18;
		
		//for catch the runtimeException
		try  {
			//nocatch.method1();
			nocatch.method3();
		}catch (NullPointerException ex){
			System.out.println("Catch runtime Exception "+ ex.getMessage());
		}finally {
			System.out.println("finallly is executed ");
		}
	}
	
	private void method1(){
		System.out.println("1");
		method2();
		System.out.println("2");
	}

	private void method2(){
		String s =null;
		System.out.println("3");
		s.length();
		System.out.println("4");
		
	}
	
	private void method3(){
		int []  ix = new int[10];
		System.out.println("5");
		System.out.println(ix[12]);
		System.out.println("6");
		
	}
	
}
