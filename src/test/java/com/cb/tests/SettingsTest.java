
package com.cb.tests;

import org.testng.annotations.Test;

import com.cb.pages.BasePage;
import com.cb.pages.SettingsPage;

public class SettingsTest extends BasePage {

	SettingsPage settingsPage;
	LoginTest loginTest;
	
	@Test
	public void verifyUserAbleToChangeTheOptionsInSettingsPage() throws InterruptedException {
		try {
			loginTest = new LoginTest();
			loginTest.loginToTheApp();
			
			test = extent.createTest("Settings Test");
			settingsPage = new SettingsPage(driver);
			settingsPage.clickOnMenu();
			test.info("Click on Menu");
			settingsPage.clickOnSettings();
			test.info("click on settings option");
			settingsPage.changeTheCurrency();
			test.info("change the currency");
			settingsPage.changeTheDistanceunit();
			test.info("Change the Distance unit");
//			settingsPage.EnableDynamicPricing();
//			test.info("Enable Dynamic Pricing");
//			settingsPage.disableDynamicPricing();
//			test.info("Disable Dynamic Pricing");
			test.pass("Successful");
		} catch (Exception e) {
			test.fail("Failed "+ e.getMessage());
		}
	}
	
}
