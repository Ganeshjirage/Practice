package com.design.pattern.singleton;

public class Singleton {

	public static void main(String[] args) {
		Demo demo1 = Demo.getAllDetails();
		Demo demo2 = Demo.getAllDetails();
		Demo demo3 = Demo.getAllDetails();

		System.out.println(demo1.hashCode());
		System.out.println(demo2.hashCode());
		System.out.println(demo3.hashCode());

	}

}
