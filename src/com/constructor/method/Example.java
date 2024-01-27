package com.constructor.method;

public class Example {

	public Example() {
		this("Java", "Kothrud", 41);
		System.out.println("Inside constructor without paramater");
	}

	public Example(String str, String name, int id) {
		System.out.println("inside constructor with parameter " + str + " " + name + " " + id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e = new Example();

	}

}
