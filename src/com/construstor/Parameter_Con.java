package com.construstor;

public class Parameter_Con {

	int empId;
	String empName;
	String company;

	public Parameter_Con(int employeeId, String employeeName, String employeeCompany) {
		empId = employeeId;
		empName = employeeName;
		company = employeeCompany;
		System.out.println("Employee id is " + empId);
		System.out.println("Employee name is " + empName);
		System.out.println("Employee company is " + company);
	}

	public Parameter_Con(int employeeId, String employeeName) {
		empId = employeeId;
		empName = employeeName;

		System.out.println("Employee id is " + empId);
		System.out.println("Employee name is " + empName);

	}

	@Override
	public String toString() {
		return "Parameter_Con [empId=" + empId + ", empName=" + empName + ", company=" + company + "]";
	}

	public static void main(String[] args) {

		Parameter_Con pc = new Parameter_Con(2087919, "Ganesh", "Cognizant");
		Parameter_Con pc1 = new Parameter_Con(123456, "Mini");
	}

}
