package com.cb.pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class ProfilePage {
 
	 public static  WebDriver driver;
	 
	public  ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
	 By menuoption = By.xpath("(//*[@class='android.widget.Button'])[1]");
	 
	 By profile = By.xpath("//android.widget.Button[@content-desc=\"Profile\"]");
	 By updateProfile = By.xpath("//android.widget.Button[@content-desc=\"Update Profile\"]");
	 By fName = By.xpath("//android.view.View[@content-desc=\"First Name\"]");
	 By lName = By.xpath("//android.view.View[@content-desc=\"Last Name\"]");
	 By userName = By.xpath("//android.view.View[@content-desc=\"User Name\"]");
	 By phone = By.xpath("//android.view.View[@content-desc=\"Phone\"]");
	 
	 
	 public void clickOnMenu() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(menuoption));
	  	    element.click();
	  	    
    	
    }
	 
	 public void clickOnProfile() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(profile));
	  	    element.click();
	 }
	 
	 public void clickOnUpdateProfile() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(updateProfile));
	  	    element.click();
	  	    Thread.sleep(3000);
	  	    driver.navigate().back();
	  	    driver.navigate().back();
	  	    driver.navigate().back();
	 }
	 
	 public void verifyFirstName() throws InterruptedException {
		 Thread.sleep(3000);
		String FNAME = driver.findElement(fName).getText();
		driver.findElement(fName).isDisplayed();
		System.out.println(FNAME);
		driver.navigate().back();
		driver.navigate().back();

		//Assert.assertEquals("First Name", FNAME);
	 }
	 
	
}
