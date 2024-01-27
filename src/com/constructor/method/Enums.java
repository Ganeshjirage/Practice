package com.constructor.method;

public class Enums {
	enum Level {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Level lvl : Level.values()) {
			System.out.println(lvl);
		}
	}

}
