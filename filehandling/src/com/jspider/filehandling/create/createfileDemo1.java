package com.jspider.filehandling.create;

import java.io.File;
import java.io.IOException;

public class createfileDemo1 {
	public static void main(String[] args) {
	
		
		File file =new File("demo.text");
		
		
		try {
			file.createNewFile();
			
			
			System.out.println("File create sucessfully");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
