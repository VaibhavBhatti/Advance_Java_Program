package com.jspider.filehandling.operations;

import java.io.File;
import java.io.IOException;

public class createdemo1 {
	public static void main(String[] args) {
		File file=new File("D://Program Files//filedemo/Test.txt");
		if (file.exists()) {
			System.out.println("file are  already");
		}
		try {
			file.createNewFile();
			System.out.println("file are create sucessfully");
		} catch (IOException e) {
			System.out.println("file are Not create");
			
			e.printStackTrace();
		}
	}

}
