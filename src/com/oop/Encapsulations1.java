package com.oop;

import java.util.Scanner;

public class Encapsulations1 {
	public void getUserInputs() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter student Id");
		int id = scan.nextInt();

		System.out.println("Enter student name");
		String name = scan.next();

		System.out.println("Enter student city");
		String city = scan.next();

		Encapsulations enc = new Encapsulations();
		enc.setStudentId(id);
		enc.setStudentName(name);
		enc.setStudentCity(city);

		System.out.println("Student id - " + enc.getStudentId());
		System.out.println("Student name - " + enc.getStudentName());
		System.out.println("Student city - " + enc.getStudentCity());
	}

	public static void main(String[] args) {
		Encapsulations1 en = new Encapsulations1();
		en.getUserInputs();

	}

}
