package com.java1_8.fearures;

public interface Example {
	default void m1() {
		System.out.println("this is default m1 method");
	}

	static void x1() {
		System.out.println("this is static x1 method");
	}

}
