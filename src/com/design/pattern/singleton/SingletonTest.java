package com.design.pattern.singleton;

public class SingletonTest {
	private static SingletonTest s;

	private static SingletonTest test() {
		s = new SingletonTest();
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SingletonTest.s.test().hashCode());
		System.out.println(SingletonTest.s.test().hashCode());
		System.out.println(SingletonTest.s.test().hashCode());

	}

}
