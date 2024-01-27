package com.oop;

public class Poly2 extends Poly1 {

	@Override
	public void m1() {

		super.m1();
	}

	@Override
	public void m2() {

		super.m2();
	}

	public static void main(String[] args) {
		Poly2 p2 = new Poly2();
		p2.m1();
		p2.m2();
	}

}
