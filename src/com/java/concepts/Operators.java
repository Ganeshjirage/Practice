package com.java.concepts;

import com.java.concept.Methods;

public class Operators {

	public static void main(String[] args) {

		/*
		 * int x = 50; int y = 90; int no = (x > y) ? x : y; true -print x value; false
		 * -print y value System.out.println(no);
		 */
		int x = 8;
		System.out.println(x << 2); // 8 * 2^2 = 8 * 4 = 32
		System.out.println(x << 3); // 8 * 2^3 = 8 * 8 = 64
		System.out.println(x >> 3); // 8 / 2^3 = 8 / 8 = 1
		System.out.println(x >> 2); // 8 / 2^2 = 8 / 4 = 2
		Methods m = new Methods();
		m.nonStaticMethod();
		m.staticMethod();
	}

}
