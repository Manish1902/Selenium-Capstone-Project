package Hooks1;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Annotations {
	@Before("@Sanity")
	public void sample1() {
		System.out.println("Before Scenario");
	}

	@After("@Sanity")
	public void sample2() {
		System.out.println("After Scenario");
	}

}
