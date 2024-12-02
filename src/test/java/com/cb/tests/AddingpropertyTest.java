package com.cb.tests;

import org.testng.annotations.Test;

import com.cb.pages.AddingpropertyPage;
import com.cb.pages.BasePage;

public class AddingpropertyTest extends BasePage{

	AddingpropertyPage addingpropertyPage;
	LoginTest loginTest;
	
	@Test
	public void addingApropertyAsAHost() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginToTheApp();
		
		addingpropertyPage = new AddingpropertyPage(driver);
		try {
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
			
		} catch (Exception e) {
			test.fail("Failed  "+ e.getMessage());
		}
	}
	
}
