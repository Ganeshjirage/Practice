package com.java1_8.fearures;

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition addition = (a, b) -> (a + b);
		System.out.println(addition.add(10, 15));

		Addition addition1 = (int a, int b) -> (a + b);
		System.out.println(addition1.add(12, 24));

	}

}
