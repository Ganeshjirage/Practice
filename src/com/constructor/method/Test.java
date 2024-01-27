package com.constructor.method;

public class Test {

	public Test() {
		System.out.println("This is Current class constructor");
	}

	public Test(int x) {
		this();
		System.out.println("GaneshF");
	}

	public static void main(String[] args) {
		Test test = new Test(10);

		// TODO Auto-generated method stub

	}

}
