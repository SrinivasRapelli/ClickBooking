package com.cb.tests;

import org.testng.annotations.Test;

import com.cb.pages.BasePage;
import com.cb.pages.BookingPage;
import com.cb.pages.IncompleteBookingsPage;

public class IncompleteBookingsTest extends BasePage {

	IncompleteBookingsPage incompleteBookingsPage;
	LoginTest loginTest;
	BookingPage bookingPage;
	@Test
	public void IncompleteBookingFunctionality() throws InterruptedException {
		try {
			loginTest = new LoginTest();
			loginTest.loginToTheApp();
			
			test = extent.createTest("Incomplete Booking Test");
			bookingPage = new BookingPage(driver);
			
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

			incompleteBookingsPage = new IncompleteBookingsPage(driver);
			incompleteBookingsPage.selectTheCheckInAndCheckOutDates();
			test.info("Select check in and check out dates");
			incompleteBookingsPage.clickOnSaveAsDraftButton();
			test.info("click on SaveAsDraft button");
			incompleteBookingsPage.clickOnMenu();
			test.info("click on menu");
			incompleteBookingsPage.clickOnIncompleteBookings();
			test.info("Click on Incomplete bookings Option ");
			incompleteBookingsPage.clickOncontinueBtn();
			test.info("click on continue button");
			
			bookingPage.clickOnContinueButton();
			bookingPage.clickOnproceedToPaymentsbtn();
			test.pass("Click on Proceed to Payments button");
		} catch (Exception e) {
			test.fail("Failed to Login" + e.getMessage());
		}
		
	}
}
