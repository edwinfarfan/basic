package com.courses.java8.basic2;

/**
 * The aggregation is when there is no is-a relationship.
 * Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved; 
 * otherwise, aggregation is the best choice.
 * @author edwin.farfan
 *
 */
public class Aggregation {

}


class Address {  
	String city,state,country;  

	public Address(String city, String state, String country) {  
		this.city = city;  
		this.state = state;  
		this.country = country;  
	}  
}  

class Emp {  
	int id;  
	String name;  
	Address address;  


	public static void main(String[] args) {  
		Address address1=new Address("gzb","UP","india");  
		Address address2=new Address("gno","UP","india");  

	}  
}  