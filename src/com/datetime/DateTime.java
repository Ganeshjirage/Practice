package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
//		LocalDate x = LocalDate.now();
//		LocalTime x1 = LocalTime.now();
		LocalDateTime Obj1 = LocalDateTime.now();
		System.out.println("Before formatting " + Obj1);

		DateTimeFormatter Obj2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String format = Obj1.format(Obj2);
		System.out.println("After formatting " + format);

//		System.out.println(x3);
//		System.out.println(x1);
//		System.out.println(x);

	}

}
