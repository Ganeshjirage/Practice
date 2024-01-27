package com.constructor.method;

public class Exam {
	public static Exam1 getEmployeeById() {
		int id = 11;
		return new Exam1(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam1 ex = getEmployeeById();
		System.out.println(ex.id);
	}

}
