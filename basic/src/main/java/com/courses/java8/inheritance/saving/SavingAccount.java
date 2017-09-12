package com.courses.java8.inheritance.saving;
import com.courses.java8.inheritance.model.*;

public class SavingAccount extends Account{

	public void close(){
		System.out.println("closing saving");
	}
}
