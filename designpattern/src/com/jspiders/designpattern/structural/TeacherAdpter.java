package com.jspiders.designpattern.structural;

public class TeacherAdpter  extends Teacher implements Game{

	@Override
	public void football() {
	  setId(1);
	  setName("Mohit");
	  setEmail("mohit@gmail.com");
	  System.out.println(getName()+" is captain of football Team");
		
	}

	@Override
	public void hockey() {
		setId(2);
		setName("viraj");
		setEmail("viraj@gmail.com");
		System.out.println(getName()+ "  is captain of hockey Team");
		
	}

}
