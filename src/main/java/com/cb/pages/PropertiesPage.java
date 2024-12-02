package com.cb.pages;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class PropertiesPage {
 
	public static  WebDriver driver;
	
	public PropertiesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By search = By.xpath("//android.widget.Button[@content-desc=\"Search\"]");
	By textField = By.xpath("//android.widget.EditText");
	By nameOfCity = By.xpath("//android.view.View[@content-desc=\"Chester, UK\"]");
	By point = By.xpath("//*[@class='android.widget.RelativeLayout'][2]");
	By selectBtn = By.xpath("//android.widget.Button[@content-desc=\"Select\"]");
	
	
	public void enterTheCityNameInSearchBox() throws InterruptedException {
		driver.findElement(search).click();
		Thread.sleep(2000);
		driver.findElement(textField).sendKeys("Chester");
	}
	
	public void clickOnCityName() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(nameOfCity).click();
	}
	public void clickOnPoint() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(point).click();
	}
	public void clickOnSelectButton() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(selectBtn).click();
	}
	
	public void backToHomeScreen() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(4000);

	}
	
	
	
	
}
