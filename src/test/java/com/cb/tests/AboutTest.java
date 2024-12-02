package com.cb.tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.cb.pages.AboutPage;
import com.cb.pages.BasePage;

public class AboutTest extends BasePage{

	AboutPage aboutPage;
	HomeTest homeTest;
	
	@Test
	public void verifyUserAbleToAccessTheAboutPage() throws InterruptedException {
		
			test.info("About Test ");
			homeTest = new HomeTest();
			homeTest.setUpToHomePage();
			
			aboutPage = new AboutPage(driver);
			try {
				ExtentTest test = extent.createTest("About Test");
	            aboutPage.clickOnMenu();
	            test.info("Click on Menu ");
	            aboutPage.clickOnAbout();
	            test.info("Click On About option ");
	            aboutPage.readTheHeading();
	            test.info("verify the heading");
	            test.pass("Successfully verifies to the About page");
	        } catch (Exception e) {
	            test.fail("Failed to access the About page " + e.getMessage());
	        }
	}		
}
