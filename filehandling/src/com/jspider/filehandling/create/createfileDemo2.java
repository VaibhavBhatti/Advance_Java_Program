package com.jspider.filehandling.create;

import java.io.File;
import java.io.IOException;

public class createfileDemo2 {
	
	public static void main(String[] args) {
		
		File file=new File("demo.text");
		if(file.exists()) {
			System.out.println("File already exists");
			
			try {
				file.createNewFile();
				System.out.println("file created successfully");
			} catch (IOException e) {
				System.out.println("file Not created");
				
				e.printStackTrace();
			}
		}
		
	}

}
