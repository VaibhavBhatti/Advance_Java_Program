package com.jspiders.designpattern.structural;

public class StudentAdapter extends Student implements Game{

	@Override
	public void football() {
		setId(1);
		setName("pratik");
		setEmail("pratik@gmail.com");
		System.out.println(getName() + " is captain of fooball Team..!!");
		
	}

	@Override
	public void hockey() {
		setId(2);
		setName("vaibhav");
		setEmail("vaibhav@gmail.com");
		System.out.println(getName()+" is captain is hockey Team...!!");
		
		
		
	}

}
