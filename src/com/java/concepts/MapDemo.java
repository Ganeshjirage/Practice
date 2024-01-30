package com.java.concepts;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public void getdetails() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("11", "Ganesh");
		map.put("33", "Mahesh");
		map.put("61", "Ramesh");
		map.put("55", "Rahul");
		map.forEach((x, y) -> System.out.println("Key - " + x + " Value - " + y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapDemo mp = new MapDemo();
		mp.getdetails();

	}

}
