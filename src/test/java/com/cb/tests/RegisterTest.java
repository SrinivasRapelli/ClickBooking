package com.cb.tests;

import com.cb.pages.BasePage;
import com.cb.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends BasePage {
    RegisterPage registerPage;
    HomeTest  homeTest;
    LoginTest loginTest;
 
    @Test
    public void registerToTheApp() throws InterruptedException {
    	homeTest = new HomeTest();
		homeTest.setUpToHomePage();
	try {
		test = extent.createTest("RegisterTest"); 
		registerPage = new RegisterPage(driver);
		registerPage.clickOnMenu();
		test.info("click on Menu");
        registerPage.clickOnRegisterLink();
        test.info("click on Register link");
        registerPage.enterFName();
        test.info("Enter First Name");
        registerPage.enterLName();
        test.info("Enter Last Name");
       // registerPage.enterUserName();
        registerPage.enteremail();
        test.info("Enter Email");
        registerPage.enterPhone();
        test.info("Enter Phone Number");
       // registerPage.scrollDown(driver,1000);
        registerPage.scrollDown();
        registerPage.enterPass();
        test.info("Enter Password");
        registerPage.scrollDown();
        registerPage.enterCPass();
        test.info("Enter Confirm Password");
        registerPage.scrollDown();
        registerPage.clickOnRegisterButton();
        test.info("click on Register Button");
		test.pass("Successfully registered");
    } catch (Exception e) {
		test.fail("Failed "+ e.getMessage());
}
    }


}
