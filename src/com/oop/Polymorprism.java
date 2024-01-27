package com.oop;

public class Polymorprism { // method overloading -compile time Polymorprism

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(double a, double b) {
		System.out.println(a + b);
	}

	public void add(double a) {
		System.out.println(a);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void methodOne(int i) {
		System.out.println("int-arg method");
	}

	public void methodOne(float f) // overloaded methods
	{
		System.out.println("float-arg method");
	}

	public void test(Object object) {
		System.out.println("test- Object");
	}

	public void test(String string) {
		System.out.println("test- String");
	}

	public static void main(String[] args) {
		Polymorprism p = new Polymorprism();
		p.add(10, 10);
		p.add(10.5, 10.5);
		p.add(5.5);
		p.add(5, 5, 5);
		p.methodOne(10);
		p.methodOne(10.5f);
		p.test(new Object());
		p.test(new String("Ganesh"));
	}

}
