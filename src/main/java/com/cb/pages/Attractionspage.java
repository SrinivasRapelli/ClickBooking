package com.cb.pages;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Attractionspage {

	public   WebDriver driver;
	
	public Attractionspage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By attractions = By.xpath("(//android.widget.Button)[7]");
	By currentLocation = By.xpath("//android.view.View[@content-desc=\"Around current location\"]");
	By mapIcon  = By.xpath("(//android.widget.Button)[2]");
	By restaurant= By.xpath("//android.view.View[@content-desc=\"Restaurant\"]");
	 By whileusingTheAppOption = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	 By menu = By.xpath("//android.view.View[@content-desc=\"Home\r\n"
	 		+ "Tab 1 of 4\"]");
	public void clickOnAttractionsMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(attractions));
		element.click();
		
		
	}
	public void clickOnAroundCurrentLocation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(currentLocation));
		element.click();
	}
	public void clickOnMapIcon() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(mapIcon));
		element.click();
	}
	
	public void sccrollDown() {
		Dimension screenSize = driver.manage().window().getSize();

		// Define the start and end coordinates for the swipe action
		int startX = screenSize.getWidth() / 2;
		int startY = (int) (screenSize.getHeight() * 0.8);
		int endX = startX;
		int endY = (int) (screenSize.getHeight() * 0.2);

		// Perform the swipe action
		TouchAction touchAction = new TouchAction((PerformsTouchActions)driver);
		touchAction.press(PointOption.point(startX, startY))
		        .waitAction()
		        .moveTo(PointOption.point(endX, endY))
		        .release()
		        .perform();
	}
	public void clickOnWhileusingTheApp() {
		try {
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(whileusingTheAppOption));
		   
			if (element.isDisplayed()) {
				 element.click();
			}
		} catch (Exception e) {
			System.out.println("Not found the location access popup");
		}
	}
	  
	  public void clickOnHomeMenu() throws InterruptedException {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
	  	    element.click();
	  	    Thread.sleep(5000);
	  }
	
	public void clickOnRestaurant() throws InterruptedException {
		driver.findElement(restaurant).click();
		Thread.sleep(4000);
	}
	
	
	

}
