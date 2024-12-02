package com.cb.tests;

import org.testng.annotations.Test;

import com.cb.pages.BasePage;
import com.cb.pages.MyWalletPage;

public class MyWalletTest extends BasePage {

	MyWalletPage myWalletPage;
	LoginTest loginTest;
	
	@Test(priority = 0)
	public void verifyUserAbleToUpdateThePaymentInfoAndWithdrawTheMoney() throws InterruptedException {
		try {
			loginTest = new LoginTest();
			loginTest.loginToTheApp();
			
			test = extent.createTest("Wallet Test");
			myWalletPage = new MyWalletPage(driver);
			myWalletPage.clickOnMenu();
			test.info("click on menu");
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
		} catch (Exception e) {
			test.fail("Failed "+ e.getMessage());
		}
		
	}
}
