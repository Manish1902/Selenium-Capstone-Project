package org.pages;

import org.base.browser;
import org.testng.Assert;
import org.utility.takescreenshot;

import com.aventstack.extentreports.Status;

public class Page2 extends browser {
	public static void test1() throws Exception {
		extent.attachReporter(reporter);
		logger = extent.createTest("Assertion");
		logger.log(Status.INFO, "Title Validation");
		try {
			boolean result = Page1.title().matches("[A-Za-z]*[ ][-][ ]Wikipedia");
			Assert.assertTrue(result);
			logger.log(Status.PASS, "Validation Passed");
		} catch (AssertionError e) {
			System.out.print(e);
			logger.log(Status.FAIL, "Validation Failed");
			takescreenshot.screenShot("Page2");
			String filePath = System.getProperty("user.dir") + "\\target\\ScreenShot\\Page2.png";
			logger.addScreenCaptureFromPath(filePath);
		}
		extent.flush();
	}
}
