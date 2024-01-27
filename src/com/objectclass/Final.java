package com.objectclass;

public class Final {
	final int a = 10;

	public static void main(String[] args) {
		final int a = 10;
		Final f = new Final();
		// f.a = 20; we cannot change value of final variable
		System.out.println(a);
	
	}

}
