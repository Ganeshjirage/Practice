package com.string;

public class Test {

	public static void main(String[] args) {

//		String s = "Ganesh";
//		String s1 = "Ganesh";
//		s.concat("Jirage");
//		System.out.println(s);
		String s = "Ganesh";
		String s1 = new String("Jirage");
		// s.concat("Ganesh");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		System.out.println(s == s1);

	}

}
