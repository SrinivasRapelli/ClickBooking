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
        registerPage = new RegisterPage(driver);
        registerPage.clickOnRegisterLink();
        registerPage.enterFName();
        registerPage.enterLName();
        registerPage.enterUserName();
        registerPage.enteremail();
        registerPage.enterPhone();
       // registerPage.scrollDown(driver,1000);
        registerPage.scrollDown();
        registerPage.enterPass();
        registerPage.scrollDown();
        registerPage.enterCPass();
        registerPage.scrollDown();
        registerPage.clickOnRegisterButton();
    }


}
