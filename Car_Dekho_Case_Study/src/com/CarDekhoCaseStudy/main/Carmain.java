package com.CarDekhoCaseStudy.main;

import java.util.Scanner;

import com.CarDekhoCaseStudy.operation.CarOperation;

public class Carmain {
	private static CarOperation operation = new CarOperation();
	private static boolean loop = true;

	public static void main(String[] args) {

		while (loop) {
			carDekhoMenu();
		}

	}

	private static void carDekhoMenu() {
		
		System.out.println("1. Add/Remove Car Details:");
		System.out.println("2. Search Car Details ");
		System.out.println("3. Edit Car Details ");
		System.out.println("4. Exit");
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter your choice : ");
		int choice1 = scanner.nextInt();
		switch (choice1) {
		case 1:
			
			System.out.println("1. Add Car Details");
			System.out.println("2. Remove Car Detail");
			System.out.println("3. Go Back To Main Menu");
			System.out.print("\nEnter your choice : ");
			int choice2 = scanner.nextInt();
			switch (choice2) {
			case 1:
				operation.addCarDetails();
				break;

			case 2:
				operation.removeCarDetails();
				break;
				
			case 3:
				carDekhoMenu();
				break;
				
			default:
				System.out.println("\nInvalid choice. Try again..!!");
				break;
			}
			break;
		case 2:
			
			System.out.println("1. Search Car By Name");
			System.out.println("2. Search Car By Brand");
			System.out.println("3. Search All Cars");
			System.out.println("4. Go Back To Main Menu");
			
			
			int choice3 = scanner.nextInt();
			switch(choice3) {
			case 1:
				operation.searchByName();
				break;
			case 2:
				operation.searchByBrand();
				break;
			
			case 3:
				operation.getAllCarDetails();
				break;
			case 4:
				carDekhoMenu();
				break;
			default:
				System.out.println("\nInvalid choice. Try again..!!");
				break;
			}
			break;
		case 3:
			operation.editCarDetails();
			break;
		case 4:
			System.out.println("Thank you..!!");
			loop = false;
			scanner.close();
			break;

		default:
			System.out.println("\nInvalid choice. Try again..!!");
			break;
		}
	}

}

