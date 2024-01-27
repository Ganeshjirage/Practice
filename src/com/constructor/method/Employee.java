package com.constructor.method;

public class Employee {
	int id = 101;
	String name = "Ganesh";
	String city = "Pune";
	long phone = 8329088787L;

	public Employee addEmployee() {
		Employee emp = new Employee();
		System.out.println(emp);
		return emp;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", phone=" + phone + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee();
		em.addEmployee();

	}

}
