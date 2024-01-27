package com.serialization.desrial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Ganesh\\Java IO\\State.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student o = (Student) ois.readObject();
			System.out.println(o.firstname);
			System.out.println(o.lastname);
			System.out.println(o.age);
			System.out.println(o.city);

			System.out.println("Deserialization is completed");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
