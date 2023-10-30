package com.jspider.filehandling.operations;

import java.io.File; 

public class delectDemo {
	public static void main(String[] args) {
	  File file=new File("D://Program Files//filedemo/Test.txt");
	  if(file.exists()){
		  System.out.println("Name :"+ file.getName());
		  System.out.println("Path :"+ file.getAbsolutePath());
	  }
	  if(file.canRead()) {
		  System.out.println("file is readable");
	  }
	  else {
		System.out.println(" file is not redable");
	       }
	  if(file.canWrite()) {
		  System.out.println("file is writable");
		  }
	  else {
		  
		  System.out.println("file is not writable");
	       }
	  if(file.canExecute()) {
		  System.out.println("file is executable");
	  }
	  else {
		  System.out.println("fiel is not executable");
	  }{
	  System.out.println("Lenght :" +file.length());}
	 { 
	
		  System.out.println("File does not exist.");
	  }
		  

}}
