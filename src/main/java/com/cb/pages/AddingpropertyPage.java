package com.cb.pages;

import java.time.Duration;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AddingpropertyPage {

	public static WebDriver driver;
	
	public AddingpropertyPage(WebDriver driver) {
		this.driver = driver;
	}
	By menu = By.xpath("(//android.widget.Button)[1]");
	By myproperties = By.xpath("//android.widget.Button[@content-desc=\"My Properties\"]");
	By plusicon = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
	By title = By.xpath("(//android.widget.EditText)[1]");
	By city = By.xpath("(//android.widget.EditText)[2]");
	By street = By.xpath("(//android.widget.EditText)[3]");
	By postcode = By.xpath("(//android.widget.EditText)[4]");
	By discription = By.xpath("(//android.widget.EditText)[5]");
	By petsAllowed = By.xpath("//android.widget.CheckBox[@content-desc=\"Pets allowed\"]");
	By house = By.xpath("//android.widget.Button[@content-desc=\"house\"]");
	By entireplace = By.xpath("//android.widget.Button[@content-desc=\"entire place\"]");
	By nextBtn = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
	By wifi = By.xpath("//android.widget.ImageView[@content-desc=\"WIFI\"]");
	By tv = By.xpath("//android.widget.ImageView[@content-desc=\"TV\"]");
	By plusiconforFeature = By.xpath("(//android.widget.Button)[2]");
	By morefeature = By.xpath("//android.widget.EditText");
	By rooms = By.xpath("(//android.widget.Button)[2]");
	By kingBeds = By.xpath("(//android.widget.Button)[4]");
	By singleBeds = By.xpath("(//android.widget.Button)[6]");
	By doublebeds = By.xpath("(//android.widget.Button)[8]");
	By bathrooms = By.xpath("(//android.widget.Button)[10]");
	By maxGuestes = By.xpath("(//android.widget.Button)[12]");
	By infants = By.xpath("//android.widget.CheckBox");
	By selectstartdate = By.xpath("//android.view.View[@content-desc=\"Select Start Date\"]");
	By editIcon = By.xpath("(//android.widget.Button)[1]");
	By datefield = By.xpath("//android.widget.EditText");
	By okbtn = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
	By selectenddate = By.xpath("//android.view.View[@content-desc=\"Select End Date\"]");
	By whileusingTheAppOption = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	By search = By.xpath("//android.widget.Button[@content-desc=\"Search\"]");
	By searchfield = By.xpath("//android.widget.EditText");
	By cityname = By.xpath("//android.view.View[@content-desc=\"Hyderabad, Telangana, India\"]");
	By map = By.xpath("(//android.widget.FrameLayout)[5]");
	By addImagesIcon = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View");
	By galleryOption = By.xpath("//android.widget.Button[@content-desc=\"Gallery\"]");
	By image1 = By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[1]");
	By image2 = By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[2]");
	By addBtn = By.id("com.google.android.providers.media.module:id/button_add");
	By price = By.xpath("//android.widget.EditText");
	//By submitBtn = By.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
	
	
	public void scrollDown() {
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
	
	
	public void clickOnMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
		element.click();
	}
	
	public void clickonMyProperties() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(myproperties));
		element.click();
		Thread.sleep(3000);
	}
	public void clickonPlusicon() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(plusicon));
		element.click();
		Thread.sleep(3000);
	}
	public void enterTitle() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(title));
		element.click();
		element.sendKeys("VILLA 1");
	}
	public void enterCity() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(city));
		element.click();
		element.sendKeys("HYD");
	}
	public void enterStreet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(street));
		element.click();
		element.sendKeys("Street 1");
	}
	public void enterPostcode() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(postcode));
		element.click();
		element.sendKeys("500031");
	}
	public void enterDiscription() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(discription));
		element.click();
		element.sendKeys("Welcome");
		Thread.sleep(3000);
		driver.navigate().back();
	}
	public void clickOnPetsAllowed() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(petsAllowed));
		element.click();
		Thread.sleep(3000);
	}
	public void clickOnhouseOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(house));
		element.click();
		Thread.sleep(3000);
		scrollDown();
		Thread.sleep(3000);
	}
	public void clickOnentirePlaceOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(entireplace));
		element.click();
		Thread.sleep(3000);
	}
	public void clickOnNextbtn() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(nextBtn));
		element.click();
		Thread.sleep(3000);
	}
	public void selectWifiAndTVfeature() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(wifi));
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(tv));
		element.click();
		Thread.sleep(3000);
		element1.click();
		Thread.sleep(3000);
	}
	public void addMoreFeatures() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(plusiconforFeature));
		element1.click();
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(morefeature));
		element2.click();
		element2.sendKeys("Locker");
		driver.navigate().back();
		
	}
	public void addrooms() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(rooms));
		element.click();
		element.click();
		element.click();
	}
	public void addKingBeds() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(kingBeds));
		element.click();
		element.click();
		element.click();

	}
	public void addSingleBeds() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(singleBeds));
		element.click();
		element.click();
		element.click();
	}
	public void addDoubleBeds() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(doublebeds));
		element.click();
		element.click();
		element.click();
	}
	public void addBathrooms() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(bathrooms));
		element.click();
		element.click();
		element.click();
	}
	
	public void addMaxGuests() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(maxGuestes));
		element.click();
		element.click();
		element.click();
		element.click();
		element.click();
		element.click();
		element.click();
		element.click();
		scrollDown();
	}
	public void addInfantsAllowed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(infants));
		element.click();
	}
	
	public void addStartDate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectstartdate));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(editIcon));
		element1.click();
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(datefield));
		element2.clear();
		Thread.sleep(3000);
		element2.sendKeys("10/01/2025");
		Thread.sleep(3000);
		WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(okbtn));
		element3.click();
		
	}
	
	public void addEndDate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectenddate));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(editIcon));
		element1.click();
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(datefield));
		element2.clear();
		Thread.sleep(3000);
		element2.sendKeys("10/01/2026");
		Thread.sleep(3000);
		WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(okbtn));
		element3.click();
	}
	public void clickOnWhileUsingTheMobileOption() throws InterruptedException {
   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
 	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(whileusingTheAppOption));
 	    element.click();

 	    
   }
	public void locateTheCityOfTheProperty() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(search));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(searchfield));
		element1.sendKeys("Hyderabad");
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(cityname));
		element2.click();
		Thread.sleep(3000);
		WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(map));
		element3.click();
		Thread.sleep(3000);
		WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(nextBtn));
		element4.click();
	}
	
	public void addImagesOfTheProperty() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(addImagesIcon));
		element.click();
		Thread.sleep(2000);
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(galleryOption));
		element1.click();
		Thread.sleep(2000);
		WebElement photo1 = wait.until(ExpectedConditions.visibilityOfElementLocated(image1));
		photo1.click();
		WebElement photo2 = wait.until(ExpectedConditions.visibilityOfElementLocated(image2));
		photo2.click();
		Thread.sleep(2000);
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(addBtn));
		element2.click();
		Thread.sleep(5000);
	}
	
	public void addingPricePernightOfTheProperty() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(price));
		element.click();
		element.clear();
		element.sendKeys("200");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
}
