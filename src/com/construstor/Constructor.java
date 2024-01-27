package com.construstor;

public class Constructor { // Default Constructor

	String city;

	public Constructor() {
		city = "Pune";
	}

	public static void main(String[] args) {
		Constructor con = new Constructor();
		System.out.println(con.city);

	}

}
