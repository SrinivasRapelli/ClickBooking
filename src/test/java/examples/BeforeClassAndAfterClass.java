package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public class BeforeClassAndAfterClass {

    public WebDriver driver;


    @BeforeTest
    public void method2() throws InterruptedException {
    	Thread.sleep(3000);
       driver.findElement(By.className("ico-login")).click();
    }
    
    @AfterTest
    public void method5() throws InterruptedException {
    	Thread.sleep(3000);
       driver.findElement(By.linkText("BOOKS")).click();
    }

    
}