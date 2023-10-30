package com.jspiders.designpattern.creational;

import java.util.Scanner;

public class FactoryMain {
	private static  Beverage beverage;
		
	public static void main(String[] args) {
		try {
		 factory().order();
	}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println(" Beverage is not ordered ");}
		}


   private static  Beverage factory() {
	   Scanner scanner =new Scanner(System.in);
	   System.out.println(" ========== menu===========");
	   System.out.println("Enter 1 to order Masala tea\n"
	   		+ "Enter 2 to order Ginger Tea \n"
	   		+ "Enter 3 to order Lemon Tea \n"
	   		+ "Enter 4 to order Green Tea ");
	   System.out.println("----------------------------");
	   System.out.println("Enter your choice ");
	   int choice =scanner.nextInt();
	   switch (choice) {
	   case 1: beverage =new MasalaTea();
	   break;
	   case 2: beverage =new GreenTea();
	   break;
	   case 3: beverage =new LemonTea();
	   break;
	   case 4: beverage =new GreenTea();
	   break;
	   default:
		   System.out.println("Invalid choice");
		   
	   }
	   scanner.close();
	    return beverage;
	   
   }
}