package com.java1_8.fearures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			arrayList.add(i);
		}
		List<Integer> list = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list);
	}

}
