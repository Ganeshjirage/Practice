package com.design.pattern.factory;

public class FirstTier implements Booking {

	@Override
	public String getACClass() {

		return "First class AC seat available: 10";
	}

}
