package com.multithreading;

public class Test implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		Test t = new Test();
		Thread thread = new Thread(t);
		thread.start();
	}
}
