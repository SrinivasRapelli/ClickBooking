package com.cb.tests;

import org.testng.annotations.Test;

import com.cb.pages.BasePage;
import com.cb.pages.BookingPage;
import com.cb.pages.PropertiesPage;

public class PropertiesTest extends BasePage {

	PropertiesPage propertiesPage;
	HomeTest  homeTest;
	BookingPage bookingPage;
	
	@Test
	public void  searchingStaysInACity() throws InterruptedException {
		try {
			propertiesPage = new PropertiesPage(driver);
			homeTest = new HomeTest();
			homeTest.setUpToHomePage();
			
			test = extent.createTest("Properties Test");
			bookingPage = new BookingPage(driver);
			bookingPage.clickOnDestination();
			test.info("click on Destination");
			bookingPage.clickOnWhileusingTheApp();
			bookingPage.enterCityName("Chester");
			test.info("Enter the city name");
			bookingPage.selectCity();
			test.info("Select the City");
			bookingPage.clickOnProperties();
			test.info("click on properties");
			test.pass("Successful");
		} catch (Exception e) {
			test.fail("Failed "+e.getMessage());
		}	
	}
}
