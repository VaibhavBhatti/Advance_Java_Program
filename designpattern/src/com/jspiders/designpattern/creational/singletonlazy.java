package com.jspiders.designpattern.creational;

public class singletonlazy {
  private static singletonlazy singletonlazy;
  private singletonlazy() {}
 
public static singletonlazy getobject() {
	 if(singletonlazy == null) 
	  {
		  singletonlazy= new singletonlazy();
		  
	  }
	  return singletonlazy;
	  
}
}
