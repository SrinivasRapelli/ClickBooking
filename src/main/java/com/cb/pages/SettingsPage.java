package com.cb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsPage {

	public static WebDriver driver;
	
	public SettingsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By menu = By.xpath("(//android.widget.Button)[1]");
	By settings = By.xpath("//android.view.View[@content-desc=\"Settings\"]");
	By currency = By.xpath("(//android.widget.Button)[2]");
	By usd = By.xpath("(//android.widget.Button)[4]");
	By distance = By.xpath("//android.widget.Button[@content-desc=\"mi Miles\"]");
	By kms = By.xpath("//android.widget.Button[@content-desc=\"km Kilometers\"]");
	By dynamicPricing = By.xpath("//android.widget.Switch");
	By continuewithCB = By.xpath("//android.widget.Button[@content-desc=\"Continue with ClickBooking\"]");

	public void clickOnMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
		element.click();
		
	}
	
	public void clickOnSettings() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(settings));
		element.click();
	}
	public void changeTheCurrency() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(currency));
		element.click();
//		Select currencyDD = new Select(element);
//		currencyDD.selectByIndex(10);
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(usd));
		element1.click();
		Thread.sleep(2000);
	}
	public void changeTheDistanceunit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(distance));
		element.click();
//		Select distanceDD = new Select(element);
//		distanceDD.selectByIndex(0);
		
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(kms));
		element1.click();
		Thread.sleep(2000);
	}
	public void EnableDynamicPricing() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicPricing));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(continuewithCB));
		element1.click();
		
		Thread.sleep(2000);
	}
	public void disableDynamicPricing() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicPricing));
		element.click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
	}
	
}
