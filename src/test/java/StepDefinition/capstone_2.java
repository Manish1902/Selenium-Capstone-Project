package StepDefinition;

import org.pages.Page1;
import org.pages.Page2;
import io.cucumber.java.en.*;

public class capstone_2 {
    @When("User enters {string} data in Wikipedia textbox")
    public void user_enters_data_in_wikipedia_textbox(String searchData) {
        Page1.searchTextBox(searchData);
    }
    
    @And("User presses the search button")
    public void user_presses_the_search_button() {
        Page1.pressSearchButton();
    }

    @And("User selects {string} data from Wikipedia suggestion list")
    public void user_selects_data_from_wikipedia_suggestion_list(String suggestion) {
        Page1.select(suggestion);
    }

    @Then("User validates the outcomes")
    public void user_validates_the_outcomes() throws Exception {
        Page2.test1();
    }
}
