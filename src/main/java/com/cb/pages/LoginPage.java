package com.cb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver= driver;
    }

    By allowBtn =By.id("com.android.permissioncontroller:id/permission_allow_button");
    By nextBtn = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    By letsGoBtn = By.xpath("//android.widget.Button[@content-desc=\"Let's go\"]");
    By continueLink = By.xpath("//android.widget.Button[@content-desc=\"Continue\"]");
    By whileusingTheAppOption = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
   // By textMsg = By.xpath("//android.view.View[@content-desc=\"Couldn't find any properties on your location.\"]");
    By menuoption = By.xpath("(//*[@class='android.widget.Button'])[1]");
    By loginLink = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    By emailText = By.xpath("(//*[@class='android.widget.EditText'])[1]");
    By passwordText =By.xpath("(//*[@class='android.widget.EditText'])[2]");
    By loginBtn = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    By logo = By.xpath("(//android.widget.ImageView)[1]");
  
    public void clickOnAllowButton() throws InterruptedException {
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(allowBtn));
    	    element.click();
        Thread.sleep(5000);
    }

    public void clickOnNextButton() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
 	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(nextBtn));
 	    element.click();
    	
    }

    public void clickOnLetsGoButton() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(letsGoBtn));
  	    element.click();
    }

    public void clickOnContinueLink() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(continueLink));
  	    element.click();
    }

    public void clickOnWhileUsingTheMobileOption() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(whileusingTheAppOption));
  	    element.click();
    }


    public void clickOnMenu() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(menuoption));
  	    element.click();
    }
    public void clickOnLoginLink() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginLink));
  	    element.click();
    }

    public void enteremail() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(emailText));
  	    element.click();
  	    element.sendKeys("mmm222@g.com");
    }
    public void enterPassword() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordText));
   	    element.click();
   	    element.sendKeys("12345678");
    }

    public void clickOnLoginbutton() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
   	    element.click();
   	   
    }
    public void verifyTheLogo() throws InterruptedException {
   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
    	    //boolean logodisplayed= element1.isDisplayed();
    	    if (element1.isDisplayed()) {
			System.out.println("Logo diaplayed");	
			}
    	  //  System.out.println(logodisplayed+" logo displayed");
    	    Thread.sleep(5000);
    }
    

 
}
