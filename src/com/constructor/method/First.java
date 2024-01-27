package com.constructor.method;

public class First {
	int id;
	String name;
	String city;

	public First(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "First [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
