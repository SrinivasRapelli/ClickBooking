package com.cb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IncompleteBookingsPage {

	public static WebDriver driver;
	
	public IncompleteBookingsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	By menu = By.xpath("(//android.widget.Button)[1]");
	By incompletebookingBtn = By.xpath("//android.widget.Button[@content-desc=\"Incomplete Bookings\"]");
	By checkInDate = By.xpath("//android.view.View[@content-desc=\"Fri, 29 November 2024\"]");
	By checkOutdate = By.xpath("//android.view.View[@content-desc=\"Sat, 30 November 2024\"]");
	By selectDatesButton = By.xpath("//android.widget.Button[@content-desc=\"Select dates\"]");
	By saveAsdraftBtn = By.xpath("//android.widget.Button[@content-desc=\"Save as Draft\"]");
	
	By continueBtn = By.xpath("//android.widget.Button[@content-desc=\"Continue\"]");
	
	public void selectTheCheckInAndCheckOutDates() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(checkInDate));
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(checkOutdate));
		element.click();
		element1.click();
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(selectDatesButton));
		element2.click();
		//driver.navigate().back();
		
	}
	
	public void clickOnSaveAsDraftButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(saveAsdraftBtn));
		element.click();
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
	}
	
	public void clickOnMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
		element.click();
		
	}
	
	public void clickOnIncompleteBookings() {
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(incompletebookingBtn));
		element.click();
	}
	
	public void clickOncontinueBtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(continueBtn));
		element.click();
	}
}
