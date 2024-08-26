package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Annotations {
	@Before
	public void sample1() {
		System.out.println("Before Scenario");
	}

	@BeforeStep
	public void sample3() {
		System.out.println("Before Every Step");
	}

	@AfterStep
	public void sample4() {
		System.out.println("After Every Step");
	}

	@After
	public void sample2() {
		System.out.println("After Scenario");
	}
}
