package com.oop;

public class Abstract1 extends Abstract {
	@Override
	public void m1() {
		System.out.println("Ganesh m1");

	}

	@Override
	public void m2() {
		System.out.println("Ganesh m2");

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		super.m3();
	}

	public static void main(String[] args) {

		Abstract1 a = new Abstract1();
		a.m1();
		a.m2();
		a.m3();
		System.out.println(a.a);
	}

}
