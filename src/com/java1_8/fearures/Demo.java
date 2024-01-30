package com.java1_8.fearures;

public class Demo {

	public static void m1() {
		for (int i = 1; i < 5; i++) {
			System.out.println("Child");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//---------------------------------------------Lambda Expression
//		Runnable r = () -> {
//			for (int i = 1; i < 5; i++) {
//				System.out.println("Child");
//			}
//
//		};
//		Thread t = new Thread(r);
//		t.start();
//		for (int i = 1; i < 5; i++) {
//			System.out.println("Parent");
//		}
//---------------------------------------------Method reference

		Runnable r = Demo::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 1; i < 5; i++) {
			System.out.println("Parent");
		}

	}

}
