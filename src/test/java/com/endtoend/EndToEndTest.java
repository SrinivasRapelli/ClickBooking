package com.endtoend;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.cb.pages.AboutPage;
import com.cb.pages.AddingpropertyPage;
import com.cb.pages.Attractionspage;
import com.cb.pages.BasePage;
import com.cb.pages.BookingPage;
import com.cb.pages.HomePage;
import com.cb.pages.IncompleteBookingsPage;
import com.cb.pages.LoginPage;
import com.cb.pages.LogoutPage;
import com.cb.pages.MyBookingspage;
import com.cb.pages.MyWalletPage;
import com.cb.pages.ProfilePage;
import com.cb.pages.PropertiesPage;
import com.cb.pages.SettingsPage;
import com.cb.pages.WishlistPage;

public class EndToEndTest extends BasePage {

	HomePage homePage;
	LoginPage loginPage;
	Attractionspage attractionsPage;
	ProfilePage profilePage;
	PropertiesPage propertiesPage;
	MyBookingspage myBookingsPage;
	AddingpropertyPage addingpropertyPage;
	BookingPage bookingPage;
	IncompleteBookingsPage incompleteBookingsPage;
	MyWalletPage myWalletPage;
	SettingsPage settingsPage;
	AboutPage aboutPage;
	LogoutPage logoutPage;
	WishlistPage wishlistPage;

	@Test(priority = 0)
	public void homeTest() throws InterruptedException {
		try {
			test = extent.createTest("HomeTest");
			homePage = new HomePage(driver);
			homePage.clickOnAllowButton();
			test.info("click on Allow Button");
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
			test.fail("Failed " + e.getMessage());
		}
	}

	@Test(priority = 1)
	public void loginTest() throws InterruptedException {
		try {
			loginPage = new LoginPage(driver);
			test = extent.createTest("LoginTest");
			loginPage.clickOnMenu();
			test.info("Click on Menu ");
			loginPage.clickOnLoginLink();
			test.info("Click on Login link");
			loginPage.enteremail();
			test.info("Enter email");
			loginPage.enterPassword();
			test.info("Enter password");
			loginPage.clickOnLoginbutton();
			test.info("Click on Login button ");
			loginPage.verifyTheLogo();
			test.pass("Successfully logged in to the app");
		} catch (Exception e) {
			test.fail("Failed to Login" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2)
	public void attractionsTest() throws InterruptedException {
		try {
			attractionsPage = new Attractionspage(driver);
			test = extent.createTest("Attractions Test");
			attractionsPage.clickOnAttractionsMenu();
			test.info("click on Attractions Menu");
			attractionsPage.sccrollDown();
			attractionsPage.sccrollDown();
			Thread.sleep(5000);
//			attractionsPage.clickOnAroundCurrentLocation();
//			test.info("click on Around Current location");
			attractionsPage.clickOnMapIcon();
			test.info("Click on Map Icon");
			attractionsPage.clickOnWhileusingTheApp();
			attractionsPage.clickOnHomeMenu();
			test.pass("Successfully verified the Attarctions page");
		} catch (Exception e) {
			test.fail("Failed " + e.getMessage());
		}
	}

	@Test(priority = 3)
	public void profileTest() throws InterruptedException {
		try {
			profilePage = new ProfilePage(driver);

			test = extent.createTest("Profile Test");
			profilePage.clickOnMenu();
			test.info("click on Menu");
			profilePage.clickOnProfile();
			test.info("click on Profile Option");
			profilePage.clickOnUpdateProfile();
			test.info("click on Update Profile");
			test.pass("Successful");

		} catch (Exception e) {
			test.fail("Failed " + e.getMessage());
		}

	}

	@Test(priority = 4)
	public void propertiesTest() throws InterruptedException {
		try {
			bookingPage = new BookingPage(driver);

			test = extent.createTest("Properties Test");
			bookingPage.clickOnDestination();
			test.info("click on Destination");
			bookingPage.enterCityName("Chester");
			test.info("Enter the city name");
			bookingPage.selectCity();
			test.info("Select the City");
			bookingPage.clickOnProperties();
			test.info("click on properties");
			propertiesPage = new PropertiesPage(driver);
			propertiesPage.backToHomeScreen();
			test.pass("Successful");

		} catch (Exception e) {
			test.fail("Failed " + e.getMessage());
		}
	}

	@Test(priority = 5)
	public void addingPropertyTest() throws InterruptedException {

		addingpropertyPage = new AddingpropertyPage(driver);
		test = extent.createTest("Adding Property Test");
		addingpropertyPage.clickOnMenu();
		test.info("Click on Menu");
		addingpropertyPage.clickonMyProperties();
		test.info("Click on My Properties");
		addingpropertyPage.clickonPlusicon();
		test.info("click on plus icon");
		addingpropertyPage.enterTitle();
		test.info("Enter the title");
		addingpropertyPage.enterCity();
		test.info("Enter the city name");
		addingpropertyPage.enterStreet();
		test.info("Enter the street");
		addingpropertyPage.enterPostcode();
		test.info("Enter the Postcode");
		addingpropertyPage.enterDiscription();
		test.info("Enter the destination");
		addingpropertyPage.clickOnPetsAllowed();
		test.info("Click on Pets Allowed button");
		addingpropertyPage.clickOnhouseOption();
		test.info("Select House");
		addingpropertyPage.clickOnentirePlaceOption();
		test.info("Select Entire place option");
		addingpropertyPage.clickOnNextbtn();
		test.info("click on nect button");
		addingpropertyPage.selectWifiAndTVfeature();
		test.info("Select WIFI and TV features");
		addingpropertyPage.addMoreFeatures();
		test.info("Add more features");
		addingpropertyPage.clickOnNextbtn();
		test.info("Click on Next button");
		addingpropertyPage.addrooms();
		test.info("Add rooms");
		addingpropertyPage.addKingBeds();
		test.info("Add King Beds");
		addingpropertyPage.addSingleBeds();
		test.info("Add Single beds");
		addingpropertyPage.addDoubleBeds();
		test.info("Add Double beds");
		addingpropertyPage.addBathrooms();
		test.info("Add Bathrooms");
		addingpropertyPage.addMaxGuests();
		test.info("Add max guests");
		addingpropertyPage.addInfantsAllowed();
		test.info("Click on Infants allowed");
		addingpropertyPage.clickOnNextbtn();
		test.info("Click on next button");
		addingpropertyPage.addStartDate();
		test.info("Select the Start Date");
		addingpropertyPage.addEndDate();
		test.info("Select the End Date");
		addingpropertyPage.clickOnNextbtn();
		test.info("Click on next button");
		addingpropertyPage.clickOnWhileUsingTheMobileOption();
		test.info("Click on while using the app option");
		addingpropertyPage.locateTheCityOfTheProperty();
		test.info("Locate the city of the property");
		addingpropertyPage.addImagesOfTheProperty();
		test.info("Add images of the property");
		addingpropertyPage.clickOnNextbtn();
		test.info("Click on next button");
		addingpropertyPage.addingPricePernightOfTheProperty();
		test.info("Add price per night");
		test.pass("Successful");
		

	}

	@Test(priority = 6)
	public void myBookingsTest() throws InterruptedException {
		myBookingsPage = new MyBookingspage(driver);
		myBookingsPage.BookingsMenu();
		test.info("click on My Bookings Oprion");
		test.pass("Successful");
	}

	public void bookingAPropertyTest() throws InterruptedException {
		bookingPage = new BookingPage(driver);

		test = extent.createTest("Booking Stay Test");
		bookingPage.clickOnDestination();
		test.info("click on destination field");
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

	}

	@Test(priority = 7)
	public void incompleteBookingTest() throws InterruptedException {
		test = extent.createTest("Incomplete Booking Test");
		bookingPage = new BookingPage(driver);

		bookingPage.clickOnDestination();
		test.info("click on destination field");
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

	}

	@Test(priority = 8)
	public void myWalletTest() {
		test = extent.createTest("Wallet Test");
		myWalletPage = new MyWalletPage(driver);
//		myWalletPage.clickOnMenu();
//		test.info("click on menu");
		myWalletPage.clickOnMyWallet();
		test.info("click on My Wallet Option");
		myWalletPage.clickOnpaymentInformation();
		test.info("click on Payment Information");
		myWalletPage.updatepaymentInformation();
		test.info("Update the Payment information");
		myWalletPage.clickOnUpdateBtn();
		test.info("click on Update button");
		myWalletPage.clickOnWithdrawrequest();
		test.info("click on Withdraw Request button");
		myWalletPage.clickOnClearbtn();
		test.info("clear the text field");
		myWalletPage.enterTheWithdrawAmount();
		test.info("Enter the withdraw amount");
		myWalletPage.clickOnWithdrawBtn();
		test.info("click on Withdraw button");
		test.pass("Successful");
	}

	@Test(priority = 9)
	public void settingsTest() throws InterruptedException {
		test = extent.createTest("Settings Test");
		settingsPage = new SettingsPage(driver);
//		settingsPage.clickOnMenu();
//		test.info("Click on Menu");
		settingsPage.clickOnSettings();
		test.info("click on settings option");
		settingsPage.changeTheCurrency();
		test.info("change the currency");
		settingsPage.changeTheDistanceunit();
		test.info("Change the Distance unit");
		settingsPage.EnableDynamicPricing();
		test.info("Enable Dynamic Pricing");
		settingsPage.disableDynamicPricing();
		test.info("Disable Dynamic Pricing");
		test.pass("Successful");

	}

	@Test(priority = 10)
	public void wishlistTest() {

		try {
			bookingPage = new BookingPage(driver);

			test = extent.createTest("Wishlist Test");
			bookingPage.clickOnDestination();
			test.info("Click on Destination field");
			bookingPage.enterCityName("Chester");
			test.info("Enter city name");
			bookingPage.selectCity();
			test.info("Select the city from recommendations");

			wishlistPage = new WishlistPage(driver);
			wishlistPage.clickOnWishlistIcon();
			test.info("Click on wishlist icon");
			wishlistPage.clickOnWishlistMenu();
			test.info("Click on Menu");
			wishlistPage.verifyThePropertyAddToWishlist();
			test.info("Verify the property in Wishlist Page");
			test.pass("Successfully verified the Property in Wishlist Page");
		} catch (Exception e) {
			test.fail("Failed " + e.getMessage());
		}

	}

	@Test(priority = 11)
	public void aboutTest() {
		try {
			aboutPage = new AboutPage(driver);

			test = extent.createTest("About Test");
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

	@Test(priority = 12)
	public void logoutTest() {
		try {

			test = extent.createTest("Logout Test");

			logoutPage = new LogoutPage(driver);
//			logoutPage.clickOnMenu();
//			test.info("click on Menu");
			logoutPage.scrollDown();
			test.info("Scrolldown to Logout option");
			logoutPage.clickOnLogoutOption();
			test.info("click on Logout Option");
			test.pass("Successfully Logged out from the APP");
		} catch (Exception e) {
			test.fail("Failed " + e.getMessage());
		}
	}

}
