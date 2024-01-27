package com.oop;

public class Encapsulation {

	private int rollNo;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int No) {
		if (No > 0) {
			rollNo = No;
			System.out.println("Your roll number is " + No);
		} else {
			System.out.println("Number cannot be 0 and negative");
		}
	}

	public static void main(String[] args) {
		Encapsulation encap = new Encapsulation();
		encap.setRollNo(111);
	}

}
