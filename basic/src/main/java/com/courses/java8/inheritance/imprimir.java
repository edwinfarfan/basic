package com.courses.java8.inheritance;

public class imprimir {

	public static void main(String[] args) {
		new ID().y(new IC());
	}

}
class ID extends IC {
	void x() {
		System.out.println(1);
	}
	void y (IC b ) {
		x();
	}
}

class IC extends IB {
	void x() {
		System.out.println(2);
	}
}

class IB {
	void x() {
		System.out.println(3);
	}
	void y(IB b) {
		b.x();
	}
	
//	void y(IC c) {
//		c.x();
//	}
//	
//	void y(ID d) {
//		d.x();
//	}
//	
}
