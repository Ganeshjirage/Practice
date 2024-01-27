package com.java.concepts;

import java.util.Scanner;

public class ScannerClass {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number>>");
		int firstNumber = scanner.nextInt();
		// take the input from user use nextInt();

		System.out.println("Enter the second number>>");
		int secondNumber = scanner.nextInt();

		System.out.println("first Number>>" + firstNumber);
		System.out.println("second Number>>" + secondNumber);

		ScannerClass sc = new ScannerClass();
		System.out.println("The addition of numbers is " + sc.add(firstNumber, secondNumber));
	}

}
