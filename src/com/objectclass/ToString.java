package com.objectclass;

public class ToString {

	int x;
	String name;
	String city;

	@Override
	public String toString() {
		return "ToString [x=" + x + ", name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		ToString ts = new ToString();
		ts.x = 10;
		ts.name = "Ganesh";
		ts.city = "Baramati";

		System.out.println(ts.x);
		System.out.println(ts.name);
		System.out.println(ts.city);
	}

}
