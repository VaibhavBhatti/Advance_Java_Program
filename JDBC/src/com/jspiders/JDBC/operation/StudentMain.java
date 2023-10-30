package com.jspiders.JDBC.operation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentJdbc studentJdbc = new StudentJdbc();
		Scanner scanner =new  Scanner(System.in);
		boolean flag =true;
		
		
		while(flag) {
			System.out.println("Enter 1 to add student");
			System.out.println("Enter 2 to get all student");
			System.out.println("enter 3 to get student by id");
			System.out.println("enter 4 to delect student.");
			System.out.println("enter 5 to update student");
			System.out.println("enter 6 to exit.");
		
		System.out.println("Enter your choice.");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			Student student = new Student();
			System.out.println("Enter student id.");
			student.setId(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter student name.");
			student.setName(scanner.nextLine());
			System.out.println("Enter student email.");
			student.setEmail(scanner.nextLine());
			System.out.println("Enter student age.");
			student.setAge(scanner.nextInt());
			System.out.println("Enter student fees.");
			student.setFees(scanner.nextDouble());
			studentJdbc.addstudent(student);
			break;
		case 2:
			List<Student> students = studentJdbc.getAllStudents();
			for (Student s : students) {
				System.out.println(s);
			}
			break;
				
		case 3:
			System.out.println("Enter student id.");
			Student s = studentJdbc.getStudentById(scanner.nextInt());
			System.out.println(s);
			break;
		case 4:
			System.out.println("Enter student id.");
			studentJdbc.deleteStudent(scanner.nextInt());
			break;
		case 5:
			System.out.println("Enter student id.");
			studentJdbc.updateStudent(scanner.nextInt(), scanner);
			break;
		case 6:
			System.out.println("Thank you!");
			flag = false;
			break;
		default:
			System.out.println("Invalid choice.");
		}
	}
	scanner.close();
}
}
