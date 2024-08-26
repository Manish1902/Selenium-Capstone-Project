package Hooks2;

import io.cucumber.java.Before;

public class Annotations {
	@Before(order = 1)
	public void sample1() {
		System.out.println("Before1 Scenario");
	}

	@Before(order = 2, value = "@Sanity")
	public void sample2() {
		System.out.println("Before2 Scenario");
	}
}
