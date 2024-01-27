package com.objectclass;

public class Equals {
	int id;
	String name;

	public void m1() {
		Equals e = new Equals();
		e.id = 10;
		e.name = "Ganesh";

		Equals e1 = new Equals();
		e1.id = 20;
		e1.name = "Mahesh";

		e = e1;

		System.out.println(e.equals(e1));
	}

	public static void main(String[] args) {
		Equals ee = new Equals();
		Equals e2 = new Equals();
		System.out.println(ee.equals(e2));
		ee.m1();
	}

}
