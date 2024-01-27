package com.input.output;

import java.io.File;

public class Ganesh {

	public static void main(String[] args) {
		File my = new File("C:\\Users\\Ganesh\\Java IO\\Ganesh.txt");
		if (my.exists()) {
			System.out.println("The file name is  " + my.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}

	}

}
