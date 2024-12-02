package com.cb.tests;

import org.testng.annotations.Test;

import com.cb.pages.BasePage;
import com.cb.pages.LogoutPage;


@Test
public class LogoutTest extends BasePage{

	LoginTest loginTest;
	LogoutPage logoutPage;
	public void verifyUserAbleToLogout() throws InterruptedException {
		
		try {
			loginTest = new  LoginTest();
			loginTest.loginToTheApp();
			test.pass("Successfully logged into the APP");
			
			test = extent.createTest("Logout Test");
			
			logoutPage = new LogoutPage(driver);
			logoutPage.clickOnMenu();
			test.info("click on Menu");
			logoutPage.scrollDown();
			test.info("Scrolldown to Logout option");
			logoutPage.clickOnLogoutOption();
			test.info("click on Logout Option");
			test.pass("Successfully Logged out from the APP");
		} catch (Exception e) {
			test.fail("Failed "+ e.getMessage());
		}
	}
}
