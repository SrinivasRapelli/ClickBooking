package com.cb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.runtime.model.CustomPreview;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class HotelsPage {
	WebDriver driver;
	public HotelsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By destination = By.xpath("(//android.view.View)[6]");
	By whileUsingTheApp = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	By searchField = By.xpath("//android.widget.EditText");
	By city = By.xpath("//android.view.View[@content-desc=\"Chester, UK\"]");
	By checkInCheckOutField = By.xpath("(//android.view.View)[8]");
	By forward = By.xpath("//android.widget.Button[@content-desc=\"Forward\"]");
	
	By checkIndate = By.xpath("//android.view.View[@content-desc=\"Fri, 29 November 2024\"]");
	By checkOutDate = By.xpath("//android.view.View[@content-desc=\"Sat, 30 November 2024\"]");
	By selectDatesButton = By.xpath("//android.widget.Button[@content-desc=\"Select dates\"]");
	By searchButton =By.xpath("//android.widget.Button[@content-desc=\"Search\"]");
	
	By hotel = By.xpath("(//android.view.View)[17]");
	
	By selectRoomButton = By.xpath("//android.widget.Button");
	By roomType = By.xpath("(//android.view.View)[15]");
	By selectButton = By.xpath("//android.widget.Button[@content-desc=\"Select\"]");
	By email = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
	By phoneNumber = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
	By fname =By.xpath("//android.widget.ScrollView/android.widget.EditText[3]");
	By lname = By.xpath("//android.widget.ScrollView/android.widget.EditText[4]");
	By checkBox = By.xpath("//android.widget.CheckBox");
	By completeBookingBtn = By.xpath("//android.widget.Button[@content-desc=\"Complete Booking\"]");
	
	
	
	By cardnumber = By.xpath("(//android.widget.EditText)[3]");
	By cardHolder = By.xpath("(//android.widget.EditText)[4]");
	By expiryDate = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View");
	By cvv= By.xpath("(//android.widget.EditText)[5]");
	By ok = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
	
	//By checkBox = By.xpath("//android.widget.CheckBox");
	By confirmButton = By.xpath("//android.widget.Button[@content-desc=\"Confirm\"]");
	By hotelConfirm = By.xpath("//android.view.View[@content-desc=\"My Hotel Bookings\"]");
	By roomDetails = By.xpath("//android.view.View[@content-desc=\"Room Details\"]");
	
	
	
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
	public void clickOnSearchField() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));
	    element.click();
	}
	
	
	public void enterCityName() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));
	    element.sendKeys("Chester");
	}
	
	public void selectCity() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(city));
	    element.click();
	}
	
	public void enterCheckInandCheckOutDates() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(checkInCheckOutField));
	    element.click();
//	    WebElement elemen1 = wait.until(ExpectedConditions.visibilityOfElementLocated(forward));
//		elemen1.click();
	    WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(checkIndate));
	    element2.click();
	    WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(checkOutDate));
	    element3.click();
	}
	
	public void clickOnSelectdatesButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectDatesButton));
	    element.click();
	}
	
	public void clickOnSearchButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
	    element.click();
	}
	
	public void clickOnAHotelButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(hotel));
	    element.click();
	}
	
	public void scrollDown() throws InterruptedException {
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
		Thread.sleep(3000);
	}
	
	public void clickOnSelectButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectRoomButton));
	    element.click();
	}
	
	public void selectARoom() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(roomType));
	    element.click();
	    WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(selectButton));
	    element1.click();  
	}
	
	public void scroll2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(completeBookingBtn));
	    
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public void enterGuestDetails() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		element.click();
		element.sendKeys("dfvd@g.com");
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumber));
		element1.click();
		element1.sendKeys("0028474");
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(fname));
		element2.click();
		element2.sendKeys("ram");
		WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(lname));
		element3.click();
		element3.sendKeys("raj");
		Thread.sleep(5000);
		driver.navigate().back();
		WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(checkBox));
		element4.click();
	}
	
	public void clickOnCompleteBookingButton() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(completeBookingBtn));
		element.click();
	}
	
	
	public void enterCradDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fname));
		element.click();
		element.sendKeys("Srini");
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(lname));
		element1.click();
		element1.sendKeys("R");
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(cardnumber));
		element2.click();
		element2.sendKeys("12345678910");
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(cardHolder));
		element3.click();
		element3.sendKeys("VISA");
		
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(expiryDate));
		element4.click();
		
		
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element5= wait.until(ExpectedConditions.visibilityOfElementLocated(ok));
		element5.click();
		
		WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element6 = wait.until(ExpectedConditions.visibilityOfElementLocated(cvv));
		element6.click();
		element6.sendKeys("4535");

		
	}
	public void clickOnConfirmButton() {
		driver.navigate().back();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmButton));
	    element.click();
	}
	
	public void verifyTheBooking() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(hotelConfirm));
	    element.click();
//	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(roomDetails));
	    try {
			if (element.isDisplayed()) {
				System.out.println("Booked Successfully");
			}
		} catch (Exception e) {
			System.out.println("Booking unsuccessful" +e.getMessage());
		}
	}
	
	
	
}
