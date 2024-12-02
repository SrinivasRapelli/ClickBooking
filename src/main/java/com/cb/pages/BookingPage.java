package com.cb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingPage {
	
	public static WebDriver driver;

	public BookingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By destination = By.xpath("(//android.view.View)[6]");
	By whileUsingTheApp = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	By searchField = By.xpath("//android.widget.EditText");
	By city = By.xpath("//android.view.View[@content-desc=\"Chester, UK\"]");
	By properties = By.xpath("//android.widget.ScrollView/android.widget.Button[3]");
	By bookNowBtn= By.xpath("//android.widget.Button[@content-desc=\"Book Now\"]");
    By bookBtn = By.xpath("//android.widget.Button[@content-desc=\"Book\"]");
    By guestEdit =  By.xpath("(//android.view.View)[8]");
	By adult = By.xpath("(//android.widget.Button)[2]");
	
	By child = By.xpath("(//android.widget.Button)[4]");
	
	By checkInAndOut =  By.xpath("(//android.view.View)[9]");
	
	By checkIn = By.xpath("//android.view.View[@content-desc=\"Fri, 29 November 2024\"]");
	By checkOut =By.xpath("//android.view.View[@content-desc=\"Sat, 30 November 2024\"]");
	By selectDatesButton = By.xpath("//android.widget.Button[@content-desc=\"Select dates\"]");
	By continuebtn = By.xpath("//android.widget.Button[@content-desc=\"Continue\"]");
	By proceedToPayments = By.xpath("//android.widget.Button[@content-desc=\"Proceed to Payments\"]");
	
	
	
	
	public void clickOnDestination() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(destination));
	    element.click();
	}
	public void clickOnWhileusingTheApp() {
		try {
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(whileUsingTheApp));
		   
			if (element.isDisplayed()) {
				 element.click();
			}
		} catch (Exception e) {
			System.out.println("Not found the location access popup");
		}
	}
	
	public void enterCityName(String cityName) throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));
		element.click();
		element.sendKeys(cityName);
		
	}
	
	public void selectCity() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(city));
		element.click();
		Thread.sleep(3000);
	}
	public void clickOnProperties() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(properties));
		element.click();
		Thread.sleep(3000);

	}
	
	public void clickOnBookNowButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(bookNowBtn));
	    element.click();
	}
	public void clickOnBookBtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(bookBtn));
	    element.click();
	}
	
	public void addGuests() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(guestEdit));
	    element.click();
	    Thread.sleep(3000);
	    WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(adult));
	    element1.click();
	    element1.click();
	    WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(child));
	    element2.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	}
	
	public void clickOnCheckIn_CheckOutOption() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(checkInAndOut));
	    element.click();
	}
	public void addCheckInCheckOutDates() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(checkIn));
		    WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(checkOut));

		    element.click();
		    element1.click();
		} catch (Exception e) {
			System.out.println("....."+ e);
		}
	    //driver.navigate().back();
	}
	
	
	public void clickOnSelectDatesButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectDatesButton));
	    element.click();
	}
	public void clickOnContinueButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(continuebtn));
	    element.click();
	}
	
	public void clickOnproceedToPaymentsbtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToPayments));
	    element.click();
	    driver.navigate().back();
	    driver.navigate().back();
	    driver.navigate().back();
	    driver.navigate().back();
	    driver.navigate().back();

	}
	
	
	
	
	
	
}
