package com.cb.tests;

import org.testng.annotations.Test;

import com.cb.pages.Attractionspage;
import com.cb.pages.BasePage;

public class AttractionsTest extends BasePage {
	
	Attractionspage attractionsPage;
	HomeTest  homeTest;

	@Test
	public void verifyTheCategoriesOfTheAttractionsPage() throws InterruptedException {

		homeTest = new HomeTest();
		homeTest.setUpToHomePage();
		attractionsPage = new Attractionspage(driver);
		try {
			test = extent.createTest("Attractions Test");
			attractionsPage.clickOnAttractionsMenu();
			test.info("click on Attractions Menu");
			attractionsPage.clickOnWhileusingTheApp();;
			test.info("click on while using the app option");
			attractionsPage.sccrollDown();
			attractionsPage.sccrollDown();
			Thread.sleep(5000);
//			attractionsPage.clickOnMapIcon();
//			test.info("click on Map icon");
//			attractionsPage.clickOnAroundCurrentLocation();
//			test.info("click on Around Current location");
			
			test.pass("Successfully verified the Attarctions page");
			} catch (Exception e) {
			test.fail("Failed " + e.getMessage());
		}
		
	}

}
