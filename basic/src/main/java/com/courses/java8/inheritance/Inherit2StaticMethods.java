package com.courses.java8.inheritance;

public class Inherit2StaticMethods {
	
	
	public static void main (String arg[]) {
		One.metodo(1);
		Two.metodo(1);//aqui no existe instancia
		
		Two t= new Two(3);
		t.metodo(1);  // a pesar de que t es instanciada con Two llama al metodo de la clase One. porque?
//		t.metodo(1);  // porque se esta llamando al metodo(int) tenemos que llamarlo con metodo(1L)

		
		One o = t;
		o.metodo(1);
		
		System.out.println(o.toString());
	}
}

abstract class One {
	int v;
	One(int v){
		
	}
	
//	public abstract static void metodo1 (int l);  // metodos estaticos no admite abstract
	
	public static void metodo (int l){
		System.out.println("One...");
	}
	
}

class Two extends One {
	
	
	Two (int v){
	super(v);
	}
//	Two (String a, String b){
//	super(2);	
//	}
	public static void metodo (int h){
		System.out.println("Two...");
		//super.metodo();  /// super no se puede utilizar con metodos staticos
	}
}
