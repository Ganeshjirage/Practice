package com.multithreading;

public class Employee implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		Thread t = new Thread(emp);
		Thread t2 = new Thread(emp);
		t.start();
		t2.start();
	}

}
