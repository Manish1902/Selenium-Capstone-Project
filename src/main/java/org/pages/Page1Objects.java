package org.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Page1Objects {
	@FindBy(name = "search")
	WebElement textBox;

	@FindBy(xpath = "//i[@class='sprite svg-search-icon']")
	WebElement element;

	@FindAll(@FindBy(xpath = "//input[@id='searchInput']"))
	@CacheLookup
	List<WebElement> list;
	
	@FindBy(xpath = "//a[@data-mw='interface']//span[contains(text(),'Log in')]")
	WebElement loginButton;
	
	@FindBy(xpath = "//input[@id='wpName1']")
    WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='wpPassword1']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[@id='wpLoginAttempt']")
    WebElement loginAttemptButton;
}