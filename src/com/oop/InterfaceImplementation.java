package com.oop;

public class InterfaceImplementation implements Interface, Interface1 {
	@Override
	public void m1() {
		System.out.println("Abstract m1 method");

	}

	@Override
	public void m2() {
		System.out.println("Abstract m2 method");

	}

	public static void main(String[] args) {
		InterfaceImplementation impl = new InterfaceImplementation();
		impl.m1();
		impl.m2();
		impl.x1();
		System.out.println(impl.a);

	}

	@Override
	public void x1() {
		System.out.println("X1 method of inerface 2");
	}

}
