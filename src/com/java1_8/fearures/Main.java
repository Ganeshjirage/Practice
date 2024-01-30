package com.java1_8.fearures;

public class Main implements Test {
	@Override
	public void getStudentName(String name) {
		System.out.println(name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.getStudentName("Ganesh");

	}

}
