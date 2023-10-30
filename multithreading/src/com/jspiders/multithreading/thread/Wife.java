package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Account;

public class Wife extends Thread{
	private Account account;
	public Wife (Account account) {
		this.account=account;
	}

	public void run() {
		account.deposit(10000); 
		account.withraw(2000);
	}


		
	}
	


