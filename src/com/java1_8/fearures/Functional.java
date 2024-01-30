package com.java1_8.fearures;

import java.util.function.Function;
import java.util.function.Predicate;

public class Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = i -> (i > 10);
		System.out.println(p.test(11));
		System.out.println(p.test(5));

		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Ganesh"));
		System.out.println(f.apply("1000"));
	}

}
