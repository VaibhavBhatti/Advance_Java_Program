package com.jspiders.JDBC.operation;

public class Student {
private int id;
private String name;
private String email;
private int age;
private double free;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getFees() {
	return free;
}
public void setFees(double fees) {
	this.free = fees;
} 
public String toString() {

	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", fees=" + free + "]";
}
	
}

