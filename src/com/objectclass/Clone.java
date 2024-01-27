package com.objectclass;

public class Clone implements Cloneable {
	int x;

	public static void main(String[] args) throws CloneNotSupportedException {

		Clone cc = new Clone();
		cc.x = 10;
		System.out.println("Before clone " + cc.x);

		Object cc1 = cc.clone();
		System.out.println("After clone " + cc1);

	}

}
