package org.pages;

import org.base.browser;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.utility.takescreenshot;
import com.aventstack.extentreports.Status;

public class Page1 extends browser {
    static Page1Objects obj;

    public Page1() {
        obj = PageFactory.initElements(driver, Page1Objects.class);
    }

    static String title() {
        return driver.getTitle();
    }

    public static void test1(String expectedTitle) throws Exception {
        extent.attachReporter(reporter);
        logger = extent.createTest("Assertion");
        logger.log(Status.INFO, "Title Validation");
        try {
            Assert.assertEquals(title(), expectedTitle);
            logger.log(Status.PASS, "Validation Passed");
        } catch (AssertionError e) {
            System.out.print(e);
            logger.log(Status.FAIL, "Validation Failed");
            takescreenshot.screenShot("Page1");
            String filePath = System.getProperty("user.dir") + "\\target\\ScreenShot\\Page1.png";
            logger.addScreenCaptureFromPath(filePath);
        }
        extent.flush();
    }

    public static void searchTextBox(String data) {
        if (obj == null) {
            obj = PageFactory.initElements(driver, Page1Objects.class);
        }
        
        extent.attachReporter(reporter);
        logger = extent.createTest("Enter");
        logger.log(Status.INFO, "Entering Test Data in TextBox");
        try {
            obj.textBox.sendKeys(data);
            logger.log(Status.PASS, "Entering Passed");
        } catch (Exception e) {
            System.out.print(e);
            logger.log(Status.FAIL, "Entering Failed");
        }
        extent.flush();
    }
    
    public static void pressSearchButton() {
        extent.attachReporter(reporter);
        logger = extent.createTest("Pressing Search Button on Wikipedia");
        logger.log(Status.INFO, "Attempting to press the search button");

        try {
            wait.until(ExpectedConditions.elementToBeClickable(obj.element));
            obj.element.click();
            logger.log(Status.PASS, "Search button pressed successfully");
        } catch (Exception e) {
            System.out.print(e);
            logger.log(Status.FAIL, "Failed to press the search button");
        }

        extent.flush();
    }

    public static void select(String data) {
        if (obj == null) {
            obj = PageFactory.initElements(driver, Page1Objects.class);
        }
        
        extent.attachReporter(reporter);
        logger = extent.createTest("Selection of  Auto-Suggest Value");
        logger.log(Status.INFO, "Selecting Test Data from TextBox");
        try {
            wait.until(ExpectedConditions.elementToBeClickable(obj.element));
            for (int i = 0; i < obj.list.size(); i++) {
                if (obj.list.get(i).getText().equalsIgnoreCase(data)) {
                    obj.list.get(i).click();
                    break;
                }
            }
            logger.log(Status.PASS, "Selection Passed");
        } catch (Exception e) {
            System.out.print(e);
            logger.log(Status.FAIL, "Selection Failed");
        }
    }

    public static void clickLoginButton() {
        if (obj == null) {
            obj = PageFactory.initElements(driver, Page1Objects.class);
        }

        extent.attachReporter(reporter);
        logger = extent.createTest("Clicking Login Button on Wikipedia");
        logger.log(Status.INFO, "Attempting to click the Login button");

        try {
            // Waiting until the login button is clickable
            wait.until(ExpectedConditions.elementToBeClickable(obj.loginButton));

            // Click the login button
            obj.loginButton.click();

            logger.log(Status.PASS, "Login button clicked successfully");
        } catch (Exception e) {
            System.out.print(e);
            logger.log(Status.FAIL, "Failed to click the Login button");
        }

        extent.flush();
    }
    public static void enterUsername(String username) {
        if (obj == null) {
            obj = PageFactory.initElements(driver, Page1Objects.class);
        }

        extent.attachReporter(reporter);
        logger = extent.createTest("Entering Username");
        logger.log(Status.INFO, "Attempting to enter the username");

        try {
            wait.until(ExpectedConditions.visibilityOf(obj.usernameTextBox));
            obj.usernameTextBox.sendKeys(username);
            logger.log(Status.PASS, "Username entered successfully");
        } catch (Exception e) {
            System.out.print(e);
            logger.log(Status.FAIL, "Failed to enter the username");
        }

        extent.flush();
    }

    public static void enterPassword(String password) {
        if (obj == null) {
            obj = PageFactory.initElements(driver, Page1Objects.class);
        }

        extent.attachReporter(reporter);
        logger = extent.createTest("Entering Password");
        logger.log(Status.INFO, "Attempting to enter the password");

        try {
            wait.until(ExpectedConditions.visibilityOf(obj.passwordTextBox));
            obj.passwordTextBox.sendKeys(password);
            logger.log(Status.PASS, "Password entered successfully");
        } catch (Exception e) {
            System.out.print(e);
            logger.log(Status.FAIL, "Failed to enter the password");
        }

        extent.flush();
    }

    public static void pressLoginAttemptButton() {
        if (obj == null) {
            obj = PageFactory.initElements(driver, Page1Objects.class);
        }

        extent.attachReporter(reporter);
        logger = extent.createTest("Pressing Login Button");
        logger.log(Status.INFO, "Attempting to press the login button");

        try {
            wait.until(ExpectedConditions.elementToBeClickable(obj.loginAttemptButton));
            obj.loginAttemptButton.click();
            logger.log(Status.PASS, "Login button pressed successfully");
        } catch (Exception e) {
            System.out.print(e);
            logger.log(Status.FAIL, "Failed to press the login button");
        }

        extent.flush();
    }
}
