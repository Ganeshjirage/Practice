package com.java.concept;

public class Methods {
	public static void staticMethod() {
		System.out.println("This is static method");
	}

	public void nonStaticMethod() {
		System.out.println("This is non static method");
	}

	public void methodWithParameter(String name, int ege) {
		System.out.println("Name of employee is " + name + " and the ege of employee is " + ege);
	}

	public static void main(String[] args) {

		Methods sm = new Methods();

		sm.staticMethod(); // Calling static method
		Methods.staticMethod(); // Calling static method
		staticMethod(); // Calling static method

		sm.nonStaticMethod(); // Calling non static method

		sm.methodWithParameter("Ganesh", 24);  // Calling method with parameter

	}

}
