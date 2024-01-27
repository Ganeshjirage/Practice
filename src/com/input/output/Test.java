package com.input.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Ganesh\\Java IO\\Demo.txt");
			Scanner scan = new Scanner(fis);
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
