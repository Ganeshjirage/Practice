package com.objectclass;

public class GetClass {

	public static void main(String[] args) {
//		GetClass gc = new GetClass();
//		System.out.println(gc.getClass());
//		System.out.println(gc.getClass().getName());
//		System.out.println(gc.getClass().getSimpleName());
//		System.out.println(gc.getClass().getPackageName());

		GetClass gc = new GetClass();
		GetClass gc1 = new GetClass();
		gc = gc1;
		System.out.println(gc.hashCode());
		System.out.println(gc1.hashCode());
	}

}
