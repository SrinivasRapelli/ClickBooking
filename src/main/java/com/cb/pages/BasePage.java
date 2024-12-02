package com.cb.pages;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
public class BasePage {

 public static WebDriver driver;

 public static ExtentReports extent;
 public static ExtentTest test;
 
 	@BeforeSuite
 	public void initExtent() {
     extent = new ExtentReports();
     extent.attachReporter(new ExtentSparkReporter("extentReport.html"));
 	}
 
    @BeforeClass
    public   void openApp() throws InterruptedException, IOException {
    	test = extent.createTest("=========ClickBooking App=======");
        
    	
    	String appPath = "C:\\Users\\srini\\OneDrive\\Desktop\\APP\\app-release.apk";
          
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "sdk_gphone64_x86_64");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "ANDROID");
        cap.setCapability("platformVersion", "14");
        cap.setCapability("automationName", "uiAutomator2");
        //cap.setCapability("app", appPath);
        Thread.sleep(5000);
        cap.setCapability("appPackage", "com.clickbooking.online");
        cap.setCapability("appActivity", "com.clickbooking.online.MainActivity");
        //cap.setCapability("fullReset", true);
        cap.setCapability("noReset", false);
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url,cap);
       
        test.info("Launch App: Opened the application");

        System.out.println("Application Started");
        Thread.sleep(3000);
         
		
    }
    @AfterClass
    public void quitTheApp() throws InterruptedException {
    	extent.flush();
        Thread.sleep(5000);
        driver.quit();
        System.out.println("Application Ended");
    }
    
}
