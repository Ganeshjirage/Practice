package com.exception.hand;

public class Test {

	public static void main(String[] args) {
		System.out.println("line number 1");
		System.out.println("line number 2");
		try {
			int a = 10 / 0;// risky code

		} catch (ArithmeticException e) {
			System.out.println(e);

		} catch (Exception e) {
			System.out.println(e);

		} finally {
			System.out.println("this is the finally block");
		}

		// TODO Auto-generated method stub

	}

}
