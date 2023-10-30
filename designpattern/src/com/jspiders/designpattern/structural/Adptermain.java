package com.jspiders.designpattern.structural;

public class Adptermain {
	public static void main(String[] args) {
		StudentAdapter studentadapter =  new StudentAdapter(); 
		studentadapter.hockey();
		studentadapter.football();
		
		TeacherAdpter teacherAdpter =new TeacherAdpter();
		teacherAdpter.hockey();
		teacherAdpter.football();
	
	}
}
