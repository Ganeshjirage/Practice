package com.java.concepts;

public class Student {
	int a = 10;
	static int b = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student();
		System.out.println("non static a>>" + student.a++);
		System.out.println("static b>>" + student.b++);
		Student student1 = new Student();
		System.out.println("\nnon static a>>" + student1.a++);
		System.out.println("static b>>" + student1.b++);
		Student student2 = new Student();
		System.out.println("\nnon static a>>" + student2.a++);
		System.out.println("static b>>" + student2.b++);

	}

}
