package StepDefinition;

import org.base.browser;
import org.pages.Page1;
import io.cucumber.java.en.*;

public class capstone_1 {
	@Given("User open the browser")
	public void user_open_the_browser() throws Exception {
			browser.setUp();
	}

	@And("User pauses the {string}")
	public void user_pauses_the(String string) {
			browser.getUrl(string);
	}

	@Then("User verifies the title {string} of the application")
	public void user_verifies_the_title_of_the_application(String string) throws Exception {
			Page1.test1(string);
	}

	@And("User closes the browser")
	public void user_closes_the_browser() {
			browser.closeBrowser();
	}
}

