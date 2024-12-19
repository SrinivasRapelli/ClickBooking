package com.cb.pages;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

     WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By menuoption = By.xpath("(//*[@class='android.widget.Button'])[1]");
    By registerlink = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    By fName = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]");
    By lname = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]");
    By uName = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[3]");
    By email = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[4]");
    By phone = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[5]");
    By pass = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[6]");
    By cPass = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[7]");
    By registerButton = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");

    public  void scrollDown() {
        try {
            int startY = 500;
            int endY = 400;
            TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
            PointOption pointStart = PointOption.point(50, startY);
            PointOption pointEnd = PointOption.point(50, endY);
            WaitOptions waitOption = WaitOptions.waitOptions(Duration.ofMillis(500));
            touchAction.press(pointStart).waitAction(waitOption).moveTo(pointEnd).release().perform();
        } catch (Exception e) {
            e.getMessage();
        }
    }

   /* public static void scrollDown(WebDriver driver, int scrollAmount) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0," + scrollAmount + ")");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }*/

    public void clickOnMenu() throws InterruptedException {
   	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
 	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(menuoption));
 	    element.click();
   }

    public void clickOnRegisterLink() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(registerlink));
   	    element.click();
    }

    public void enterFName() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fName));
    	    element.click();
    	    element.sendKeys("Sri");
    }

    public void enterLName() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lname));
    	    element.click();
    	    element.sendKeys("mahi");
    }

    public void enterUserName() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(uName));
   	    element.click();
   	    element.sendKeys("mmm222@g.com");
   	    element.sendKeys("Sreenmaahi");
     
    }

    public void enteremail() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
    	    element.click();
    	    element.sendKeys("s@gmail.com");
    }

    public void enterPhone() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(phone));
    	    element.click();
    	    element.sendKeys("7984838455");
    }

    public void enterPass() throws InterruptedException {
      //  scrollDown(driver, 1000);
        scrollDown();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(pass));
   	    element.click();
   	    element.sendKeys("Sr@12345678");
    }

    public void enterCPass() throws InterruptedException {
        //scrollDown(driver, 1000);
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(cPass));
   	    element.click();
   	    element.sendKeys("Sr@12345678");
    }

    public void clickOnRegisterButton() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
   	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton));
   	    element.click();
    }

	
}
