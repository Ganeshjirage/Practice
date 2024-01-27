package com.java.concept;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int x = 4; int y = 2; if (x == 1) { System.out.println("Hi"); } else if (x ==
		 * 2) { System.out.println("Hello"); } else if (x == 3) {
		 * System.out.println("Bye"); } else if (x == 4) {
		 * System.out.println("Goodbye"); } else { System.out.println("default"); }
		 */
//		int day = 8;
//		switch (day) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default:
//			System.out.println("No matches found");
//		}
//		int i = 1;
//		while (i <= 5) {
//			System.out.println(i);
//			i++;
//		}
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i <= 5);
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0)
//				continue;
//			System.out.println(i);
//
//		}
//		String[] cars = { "BMW", "Volvo", "TATA", "Mahindra", "Toyota" };
//		for (String i : cars) {
//			System.out.println(i);
//		}
//		for (int i = 0; i < 10; i++) {
//			if (i == 4) {
//				// break;
//				continue;
//			}
//			System.out.println(i);
//		}
		int i = 1;
		while (i < 10) {
			if (i == 4) {
				// break;
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
