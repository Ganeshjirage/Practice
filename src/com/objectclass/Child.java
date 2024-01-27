package com.objectclass;

public class Child extends Parent {

	int x = 15;

	public void test() {
		// int x = 20;
		Child ch = new Child();

		System.out.println("By using Object " + ch.x);
		System.out.println();
		// This keyword for current class variable method and constructor
		System.out.println("By using this keyword " + this.x);
		this.testing();
		System.out.println();
		// Super keyword for immediate parent class variable method and constructor
		System.out.println("By using Super keyword " + super.x);
		super.testing();

	}

//	final void m1() {
//		System.out.println("This is final method in parent class");
//	}

	public void testing() {
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		Child ch = new Child();
		ch.test();
	}

}
