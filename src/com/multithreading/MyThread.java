package com.multithreading;

public class MyThread extends Thread {
	int sum = 0;

	public void run() {
		synchronized (this) {

			for (int i = 1; i < 5; i++) {
				sum = sum + 10;
			}
			this.notify();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread mt1 = new MyThread();
		mt1.start();
		synchronized (mt1) {

			mt1.wait();
			System.out.println(mt1.sum);

		}

	}

}
