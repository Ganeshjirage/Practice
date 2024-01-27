package com.input.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {

		try {
			FileWriter fos = new FileWriter("C:\\Users\\Ganesh\\Java IO\\Demo.txt");
			fos.write(
					"Good understanding of data structures and algorithms. Good problem solving and analytical skills. ");
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Success...");

	}

}
