package com.serialization.desrial;

import java.io.Serializable;

public class Student implements Serializable {
	String firstname;
	String lastname;
	transient int age;
	String city;
}
