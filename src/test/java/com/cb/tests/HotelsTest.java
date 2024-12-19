package com.cb.tests;
import org.testng.annotations.Test;
import com.cb.pages.BasePage;
import com.cb.pages.HotelsPage;

public class HotelsTest extends BasePage{

	LoginTest loginTest;
	HomeTest homeTest;
	HotelsPage hotelsPage;
	
	@Test
	public void checkTheHotelDetails() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginToTheApp();
    	test.info("Successfully set up to HomePage");
		try {
			test =  extent.createTest("HotelsTest");
			hotelsPage = new HotelsPage(driver);
			hotelsPage.clickOnDestination();
	       	test.info("Click on Destination ");
	       	hotelsPage.clickOnWhileusingTheApp();
			//hotelsPage.clickOnSearchField();
	       	test.info("Click on SearchField ");
			hotelsPage.enterCityName();
	       	test.info("Entered city name");
	       	hotelsPage.selectCity();
	       	test.info("Selected the city");
	       	hotelsPage.enterCheckInandCheckOutDates();
	       	test.info("Selected the check in and check out dates");
	       	hotelsPage.clickOnSelectdatesButton();
	       	test.info("Click on Select dates Button ");
	       	hotelsPage.clickOnSearchButton();
	       	test.info("Click on Search button  ");
	       	hotelsPage.scrollDown();
	       	hotelsPage.clickOnAHotelButton();
	       	test.info("Click on View button ");
	    	hotelsPage.scrollDown();
	       	hotelsPage.scrollDown();
	       	test.pass("Successfully checked the Hotels details");
	       	hotelsPage.clickOnSelectButton();
	       	test.pass("Click on Booknow button");
	    	//hotelsPage.scrollDown();
	       	hotelsPage.selectARoom();
	       	test.pass("Selected a room");
//	       	hotelsPage.enterCradDetails();
//	       	test.pass("entered the card details");
	       	
	       	hotelsPage.scrollDown();
	       	hotelsPage.scrollDown();
	       	hotelsPage.enterGuestDetails();
	       	test.pass("entered the guest details");
	       	hotelsPage.clickOnCompleteBookingButton();
	       	test.pass("click on confirm button");
	       	//hotelsPage.verifyTheBooking();
	       	//test.pass("Verified the Booking");
		} catch (Exception e) {
			test.fail("Failed to check the Hotels  "+ e.getMessage());
			e.printStackTrace();
		}		
	}
}