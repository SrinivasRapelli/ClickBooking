package com.cb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishlistPage {
	public static WebDriver driver;
	public WishlistPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By wishlistIcon = By.xpath("(//android.view.View)[16]");
	By wishlist = By.xpath("(//android.widget.Button)[12]");
	By property = By.xpath("//android.widget.ImageView");
	By home = By.xpath("(//android.widget.Button)[3]");
	
	public void clickOnWishlistIcon() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(wishlistIcon));
		element.click();
		//element.click();
		Thread.sleep(2000);
	}
	
	public void clickOnWishlistMenu() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(wishlist));
		element.click();
	}
	
	public void verifyThePropertyAddToWishlist() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(property));
		boolean displayed =  element.isDisplayed();
		System.out.println(displayed);
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(home));
		element1.click();
		element1.click();
		element1.click();
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(wishlistIcon));
		element2.click();
	}
	
	
}
