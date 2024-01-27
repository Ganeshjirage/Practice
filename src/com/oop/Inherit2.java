package com.oop;

public class Inherit2 extends Inherit1 {

	int b = 30;
	int c = 40;

	public void m2() {
		System.out.println("M2 method in child");
	}

	public void m3() {
		System.out.println("M3 method in child");
	}

	public static void main(String[] args) {
		Inherit1 i1 = new Inherit1(); // Parent Object
//		System.out.println(i1.a);
//		System.out.println(i1.b);
//		i1.m1();
//		i1.m2();
		Inherit2 i2 = new Inherit2(); // Child Object
//		i2.m1();
//		i2.m2();
//		i2.m3();
//		System.out.println(i2.a);
//		System.out.println(i2.b);
//		System.out.println(i2.c);
		Inherit1 i3 = new Inherit2(); // Parent class reference to hold child call object
//		i3.m1();
//		i3.m2();
//		System.out.println(i3.a);
//		System.out.println(i3.b);
		Inherit1 i4 = new Inherit1();
		Inherit2 i5 = new Inherit2();
//		i4 = i5;
//		i4.m1();
//		i4.m2();
//		System.out.println(i4.a);
//		System.out.println(i4.b);

	}

}
