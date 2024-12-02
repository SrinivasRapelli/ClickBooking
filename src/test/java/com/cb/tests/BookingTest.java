package com.cb.tests;

import org.testng.annotations.Test;

import com.cb.pages.BasePage;
import com.cb.pages.BookingPage;

public class BookingTest extends BasePage{

	BookingPage bookingPage;	
	LoginTest loginTest;
	
	@Test
	public void bookingAStay() throws InterruptedException {
		try {
			loginTest = new LoginTest();
			loginTest.loginToTheApp();
			bookingPage = new BookingPage(driver);
			test = extent.createTest("Booking Test");
			bookingPage.clickOnDestination();
			test.info("click on destination field");
			bookingPage.clickOnWhileusingTheApp();
			bookingPage.enterCityName("Chester");
			test.info("enter city name");
			bookingPage.selectCity();
			test.info("Select City ");
			bookingPage.clickOnProperties();
			test.info("Click on Properties");
			bookingPage.clickOnBookNowButton();
			test.info("Click on BookNow button");
			bookingPage.clickOnBookBtn();
			test.info("Click on Book Button");
			bookingPage.addGuests();
			test.info("Add guests");
			bookingPage.clickOnCheckIn_CheckOutOption();
			test.info("Click on checkin checkout field");
			bookingPage.addCheckInCheckOutDates();
			test.info("Add check in check out dates");
			bookingPage.clickOnSelectDatesButton();
			test.info("click on Select button");
			bookingPage.clickOnContinueButton();
			test.info("Click on continue button");
			bookingPage.clickOnproceedToPaymentsbtn();
			test.pass("Click on Proceed to Payments button");
		} catch (Exception e) {
			test.fail("failed "+ e.getMessage());
		}
	}
	
}
