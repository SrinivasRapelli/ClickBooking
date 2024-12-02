package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class ActionClass {
	static WebDriver driver;
	
	@Test
	public static void method1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\clickBooking\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		WebElement computers = driver.findElement(By.linkText("COMPUTERS"));
		
		actions.moveToElement(computers).clickAndHold().release().build().perform();
		
//		WebElement desktop = driver.findElement(By.linkText("Desktops"));
//		desktop.click();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public  void closeTheTab() {
		driver.quit();

	}
	
}
