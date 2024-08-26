package StepDefinition;

import org.pages.Page1;

import io.cucumber.java.en.*;

public class capstone_3 {
	@Then("User selects Login button from Wikipedia page")
	public void user_selects_login_button_from_wikipedia_page() {
	    // Write code here that turns the phrase above into concrete actions
		Page1.clickLoginButton();
	}
	@When("User enters the username {string}")
	public void user_enters_the_username(String username) {
	    Page1.enterUsername(username);
	}

	@And("User enters the password {string}")
	public void user_enters_the_password(String password) {
	    Page1.enterPassword(password);
	}

	@Then("User presses the login button")
	public void user_presses_the_login_button() {
	    Page1.pressLoginAttemptButton();
	}
}
