package com.multithreading;

public class Exam extends Thread {

	public static void main(String[] args) {

		Exam e = new Exam();
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getPriority()); //5
		System.out.println(e.MAX_PRIORITY);  //10
		System.out.println(e.MIN_PRIORITY);  //1
		System.out.println(e.getState());

	}

}
