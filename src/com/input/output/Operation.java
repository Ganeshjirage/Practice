package com.input.output;

import java.io.File;

public class Operation {

	public static void main(String[] args) {
		File my = new File("C:\\Users\\Ganesh\\Java IO\\Ganesh1.txt");
		if (my.delete()) {
			System.out.println("File successfully Deleted... " + my.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}

	}

}
