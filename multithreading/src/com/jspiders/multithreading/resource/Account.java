package com.jspiders.multithreading.resource;

public class Account {
    private double accountBalance;
    public Account(double accountBalance) {
    	this.accountBalance=accountBalance;
    	
    }
    public void deposit(double amount) {
    	accountBalance += amount;
    	System.out.println("Amount of rupees" + amount +"has been credited");
    	System.out.println("Update account balance = "+ accountBalance);
    	
    }
    public void withraw(double amount) {
    	if (amount > accountBalance) {
    		System.out.println("Insufficient account balance ");
    		
			
		}
    	else
    		
    	{
    		accountBalance  -=amount;
    		System.out.println("Amount of rupees" + amount +"has been depited");
        	System.out.println("Update account balance = "+ accountBalance);
    	}
    }

}
