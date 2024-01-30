package com.design.pattern.factory;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your AC class type - ");
		String booking = scan.next();

		Booking b = BookingFactory.createBooking(booking);
		System.out.println(b.getACClass());
		scan.close();
	}

}
