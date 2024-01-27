package com.constructor.method;

public class First1 {

	public static First getEmployeeDetails() {
		int id = 101;
		String name = "Ganesh";
		String city = "Pune";
		return new First(id, name, city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First e = getEmployeeDetails();
		System.out.println("id=" + e.id);
		System.out.println("name=" + e.name);
		System.out.println("city=" + e.city);

	}

}
