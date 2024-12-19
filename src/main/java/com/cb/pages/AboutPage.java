package com.cb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import net.bytebuddy.agent.builder.AgentBuilder.Identified.Extendable;

public class AboutPage {

	public static WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By menu = By.xpath("(//android.widget.Button)[1]");
	By about = By.xpath("//android.view.View[@content-desc=\"About\"]");
	By heading =By.xpath("//android.view.View[@content-desc=\"About Us\"]");
	
	public void clickOnMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
		element.click();
		
	}
	public void clickOnAbout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(about));
		element.click();
		
	}
	public void readTheHeading() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(heading));
		boolean displayedTheheading =  element.isDisplayed();
		System.out.println(displayedTheheading);
		String text = element.getText();
		System.out.println(text);
		driver.navigate().back();
		//driver.navigate().back();
		
	}
}
