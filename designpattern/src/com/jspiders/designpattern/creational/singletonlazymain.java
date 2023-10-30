package com.jspiders.designpattern.creational;

public class singletonlazymain {
	public static void main(String[] args) {
		singletonlazy object1 = singletonlazy.getobject();
		singletonlazy object2 = singletonlazy.getobject();
		singletonlazy object3 = singletonlazy.getobject();
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		
	}

}
