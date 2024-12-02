package com.cb.pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
		
		
		By notnow = By.xpath("//android.widget.Button[@content-desc=\"Not Now\"]");
		By allowBtn =By.id("com.android.permissioncontroller:id/permission_allow_button");
	    By nextBtn = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
	    By letsGoBtn = By.xpath("//android.widget.Button[@content-desc=\"Let's go\"]");
	    By continueLink = By.xpath("//android.widget.Button[@content-desc=\"Continue\"]");
	    By whileusingTheAppOption = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
	   
	    public void clickOnNotnowButton() {
	    	try {
	    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(notnow));
		    	
				if (element.isDisplayed()) {
					element.click();
				}
			} catch (Exception e) {
				System.out.println("....."+e);
			}
	    }
	    public void clickOnAllowButton() throws InterruptedException {
	    	try {
	    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(allowBtn));
	    	    element.click();
			} catch (Exception e) {
				System.out.println("....."+e);
			} 
	    	
	    	
	    }

	    public void clickOnNextButton() throws InterruptedException {
	    	try {
	    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(nextBtn));
		 	    element.click();
			} catch (Exception e) {
				System.out.println("....."+e);
			}
	    	
	    	
	    }

	    public void clickOnLetsGoButton() throws InterruptedException {
	    	try {
	    		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(letsGoBtn));
	 	  	    element.click();
			} catch (Exception e) {
				System.out.println("....."+e);
			}
	    	
	    	
	    }

	    public void clickOnContinueLink() throws InterruptedException {
	    	try {
	    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(continueLink));
		  	    element.click();
		  	  Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("....."+e);
			} 
	    	
	    	
	    }

	    public void clickOnWhileUsingTheMobileOption() throws InterruptedException {
	    	try {
	    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(whileusingTheAppOption));
		  	    element.click();
			} catch (Exception e) {
				System.out.println("....."+e);
			}
	    	
	    	

	  	    
	    }
	    
	    public void scrollWebView(AppiumDriver driver) {
	    	driver.executeScript("experitest:client.swipe(\"Up\", 0, 500)");
			
	    }
	    
	  
	    

}
