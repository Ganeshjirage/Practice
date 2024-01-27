package com.input.output;

import java.io.File;
import java.io.IOException;

public class Employee {

	public static void main(String[] args) {
		File myObj = new File("C:\\Users\\Ganesh\\Java IO\\Ganesh1.txt");
		try {
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
