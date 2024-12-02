package com.cb.tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.cb.pages.BasePage;
import com.cb.pages.BookingPage;
import com.cb.pages.WishlistPage;

public class WishlistTest extends BasePage{

	WishlistPage wishlistPage;
	LoginTest loginTest;
	BookingPage bookingPage;
	
   
	
	@Test
	public void verifyUserAbleToAddAPropertyToWishlist() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginToTheApp();
		test.info("Successfully log in to the APP");
		bookingPage = new BookingPage(driver);
		
		try {
			test = extent.createTest("Wishlist Test");
			bookingPage.clickOnDestination();
			test.info("Click on Destination field");
			bookingPage.clickOnWhileusingTheApp();
			test.info("Clicked on while used the app");
			bookingPage.enterCityName("Chester");
			test.info("Enter city name");
			bookingPage.selectCity();
			test.info("Select the city from recommendations");
			
			wishlistPage = new WishlistPage(driver);
			wishlistPage.clickOnWishlistIcon();
			test.info("Click on wishlist icon");
			wishlistPage.clickOnWishlistMenu();
			test.info("Click on wishlist Menu");
			wishlistPage.verifyThePropertyAddToWishlist();
			test.info("Verify the property in Wishlist Page");
			test.pass("Successfully verified the Property in Wishlist Page");
		} catch (Exception e) {
			test.fail("Failed "+e.getMessage());
		}
	}
}
