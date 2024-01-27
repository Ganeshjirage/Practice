package com.serialization.desrial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.firstname = "Ganesh";
		stu.lastname = "Jirage";
		stu.age = 24;
		stu.city = "Pune";

		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Ganesh\\Java IO\\State.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(stu);
			oos.close();
			System.out.println("Serialization is done");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
