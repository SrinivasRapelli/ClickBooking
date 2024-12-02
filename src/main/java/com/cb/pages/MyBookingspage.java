package com.cb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyBookingspage {

	public static WebDriver driver;
	public MyBookingspage(WebDriver driver) {
		this.driver = driver;
	}
	
	By menu = By.xpath("(//android.widget.Button)[1]");
	By mybookings = By.xpath("(//android.widget.Button)[9]");
	
	
	public void clickOnMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
		element.click();
	}
	
	public void BookingsMenu() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(mybookings));
		element.click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(5000);
	}
}
