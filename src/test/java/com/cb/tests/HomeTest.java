package com.cb.tests;

import org.testng.annotations.Test;
import com.cb.pages.BasePage;
import com.cb.pages.HomePage;
public class HomeTest extends BasePage{
	
	HomePage homePage;
	BasePage basePage;
	
	@Test
	public void setUpToHomePage() throws InterruptedException {
		try {
			test = extent.createTest("HomeTest"); 
					homePage = new HomePage(driver);
					
					homePage.clickOnAllowButton();
					test.info("click on Allow Button");
					homePage.clickOnNotnowButton();
					test.info("Click on not now button");
					homePage.clickOnNextButton();
					test.info("Click on Next button");
					homePage.clickOnNextButton();
					test.info("click on Next button");
					homePage.clickOnLetsGoButton();
					test.info("click on Let's Go button");
					homePage.clickOnContinueLink();
					test.info("click on Continue link");
					test.pass("Sucessfully set up to Homepage");
		} catch (Exception e) {
					test.fail("Failed "+ e.getMessage());
		}
	}
}
