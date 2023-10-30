package com.jspiders.designpattern.creational;

import java.util.Scanner;

public class Factorymain1 {
	private static  Carmenu car;
		
	public static void main(String[] args) {
		try {
		 factory().buy();
	}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println(" do not buy car ");}
		}


   private static  Carmenu factory() {
	   
	   Scanner scanner =new Scanner(System.in);
	   System.out.println(" ========== menu===========");
	   System.out.println("Enter 1 to buy Thar car\n"
	   		+ "Enter 2 to buy suzuki \n"
	   		+ "Enter 3 to buy XUV700  car\n");
	   		
	   System.out.println("----------------------------");
	   System.out.println("Enter your choice ");
	   int choice =scanner.nextInt();
	   switch (choice) {
	   case 1: car =new Thar();
	   break;
	   case 2: car =new Suzuki();
	   break;
	   case 3: car =new Xuv700();
	   break;
	   
	   default:
		   System.out.println("Invalid choice");
		   
	   }
	   scanner.close();
	    return car;
	   
   }
}