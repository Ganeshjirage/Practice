package com.design.pattern.singleton;

public class Demo {
	static Demo demo = new Demo();

	private Demo() {

	}

	public static Demo getAllDetails() {
		return demo;
	}

}
