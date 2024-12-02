package com.cb.tests;

import org.testng.annotations.Test;

import com.cb.pages.BasePage;
import com.cb.pages.MyBookingspage;

public class MyBookingsTest extends BasePage{
	
	LoginTest loginTest;
	MyBookingspage myBookingsPage;
	
	@Test
	public void myBookingsFunctionality() throws InterruptedException {
		try {
		loginTest = new LoginTest();
		loginTest.loginToTheApp();
		
		myBookingsPage = new MyBookingspage(driver);
		
			test= extent.createTest("MyBookings Test");
//			myBookingsPage.clickOnMenu();
//			test.info("click on Menu");
			myBookingsPage.BookingsMenu();
			test.info("click on My Bookings Oprion");
			test.pass("Successful");
		} catch (Exception e) {
			test.fail("Failed "+e.getMessage());
		}
		
	}

}
