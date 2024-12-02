package examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingAlerts {

	
static WebDriver driver;
	
	public static void alertsHandling() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\clickBooking\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		
		driver.findElement(By.id("confirmButton")).click();
		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();
		System.out.println("Alert text: " + alertText);

		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(3000);
		String successmessage = driver.findElement(By.xpath("//*[@id=\"confirmResult\"]")).getText();
		System.out.println(successmessage);
		//alert.dismiss();
		
		driver.close();
		
	}
	
	public static void alerts1() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\clickBooking\\drivers\\chromedriver.exe");
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	
		
		driver.findElement(By.id("timerAlertButton")).click();
//		Thread.sleep(6000);
		
		Alert alerts = driver.switchTo().alert();
		
		String alertMsg = alerts.getText();
		
		System.out.println(alertMsg);
		
		alerts.accept();
		alerts.dismiss();
		alerts.sendKeys("Srini");
		
		
		Thread.sleep(3000);
		driver.quit();
			
	}
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		//alertsHandling();
		alerts1();
	}
}
