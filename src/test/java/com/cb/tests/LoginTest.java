package com.cb.tests;

import com.cb.pages.BasePage;
import com.cb.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {

    LoginPage loginPage;
    HomeTest homeTest;
   
    
    @Test(priority = 0)
    public void loginToTheApp() throws InterruptedException {
    	
    	homeTest = new HomeTest();
    	homeTest.setUpToHomePage();
    	test.info("Successfully set up to HomePage");
    	loginPage = new LoginPage(driver);
    	
    	try {
    	   test =  extent.createTest("LoginTest");
    	   loginPage.clickOnMenu();
       	   test.info("Click on Menu ");
           loginPage.clickOnLoginLink();
       	   test.info("Click on Login link ");
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
}
