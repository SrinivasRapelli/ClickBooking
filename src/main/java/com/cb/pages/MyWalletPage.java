package com.cb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWalletPage {
	public static WebDriver driver;

	public MyWalletPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By menu = By.xpath("(//android.widget.Button)[1]");
	By mywallet = By.xpath("//android.widget.Button[@content-desc=\"My Wallet\"]");
	By withdrawReq = By.xpath("//android.view.View[@content-desc=\"Withdraw Request\"]");
	By paymentInfo = By.xpath("//android.view.View[@content-desc=\"Payment information\"]");
	By accNo = By.xpath("(//android.widget.EditText)[1]");
	By bankHoldername = By.xpath("(//android.widget.EditText)[2]");
	By swift = By.xpath("(//android.widget.EditText)[3]");
	By iban = By.xpath("(//android.widget.EditText)[4]");
	By updateBtn = By.xpath("//android.widget.Button[@content-desc=\"Update\"]");
	
	By clearbutton = By.xpath("//android.view.View/android.view.View[13]");
	By num1 = By.xpath("//android.view.View[@content-desc=\"1\"]");
	By num2 = By.xpath("//android.view.View[@content-desc=\"0\"]");
	By withdrawBtn = By.xpath("//android.widget.Button[@content-desc=\"Withdraw\"]");
	
	
	public void clickOnMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
		element.click();
	}
	public void clickOnMyWallet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(mywallet));
		element.click();
	}
	public void clickOnpaymentInformation() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(paymentInfo));
		element.click();
	}
	public void updatepaymentInformation() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(accNo));
		element.click();
		element.clear();
		element.sendKeys("0000000000");
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(bankHoldername));
		element1.click();
		element1.clear();
		element1.sendKeys("Name");
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(swift));
		element2.click();
		element2.clear();
		element2.sendKeys("Swift");
		WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(iban));
		element3.click();
		element3.clear();
		element3.sendKeys("Iban");
	}
	public void clickOnUpdateBtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(updateBtn));
		element.click();
	}
	public void clickOnWithdrawrequest() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(withdrawReq));
		element.click();
	}
	public void clickOnClearbtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(clearbutton));
		element.click();
		element.click();
		element.click();
		element.click();
		element.click();
		element.click();
		element.click();
		element.click();
	}
	public void enterTheWithdrawAmount() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(num1));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(num2));
		element1.click();
		element1.click();
		element1.click();
		element1.click();
		element1.click();
		element1.click();
		}
	public void clickOnWithdrawBtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(withdrawBtn));
		element.click();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	
	
}
