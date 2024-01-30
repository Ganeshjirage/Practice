package com.java1_8.fearures;

import java.util.Optional;

public class OptionalC {
	public void m1() {
	}

	public static void main(String[] args) {

		String[] str = new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} else {
			System.out.println("String value is not present");
		}

	}

}
