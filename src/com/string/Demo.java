package com.string;

public class Demo {

	public static void main(String[] args) {
		String str = "velocity";
		String str1 = "Velocity";
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.compareTo("Ganesh"));
		System.out.println(str.concat("pune"));
		System.out.println(str.hashCode());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.equalsIgnoreCase(str1));

	}

}
