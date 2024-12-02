package com.cb.tests;

import org.testng.annotations.Test;

import com.cb.pages.BasePage;
import com.cb.pages.ProfilePage;

public class ProfileTest extends BasePage{

	ProfilePage profilePage;
	static LoginTest loginTest;
	
	@Test
	public void verifyTheProfilePage() throws InterruptedException {
		try {
			loginTest = new LoginTest();
			loginTest.loginToTheApp();
			
			test = extent.createTest("Profile Test");
			profilePage = new ProfilePage(driver);
			profilePage.clickOnMenu();
			test.info("click on Menu");
			profilePage.clickOnProfile();
			test.info("click on Profile Option");
			profilePage.clickOnUpdateProfile();
			test.info("click on Update Profile");
			test.pass("Successful");
			
		} catch (Exception e) {
			test.fail("Failed "+ e.getMessage());
		}
		
	}
}
