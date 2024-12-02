package examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShots {

	static WebDriver driver;
	
	public static  void example() throws InterruptedException, IOException {
		driver = new EdgeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationpath = "C:/screenshots1/screenshot_example1.png";
		FileUtils.copyFile(screenShot,new File(destinationpath));
		Thread.sleep(3000);
		System.out.println("Screenshot taken and saved at: " + destinationpath);
		
	}
	
	public static void eleSs() throws InterruptedException, IOException {
		
		try {
			driver = new EdgeDriver();
			
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			WebElement image = driver.findElement(By.xpath("//*[@id=\"newsletter-subscribe-button\"]"));
			
			File screenshot = image.getScreenshotAs(OutputType.FILE);
			
			String destinationpath = "C:/screenshots1/screenshot_example2.png";

			FileUtils.copyFile(screenshot, new File(destinationpath));
			
			System.out.println("Screenshot taken and saved at: " + destinationpath);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
public static void screenshotWholepage() throws InterruptedException, IOException {
		
		try {
			driver = new FirefoxDriver();
			
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			
	        File screenshot = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
			
			String destinationpath = "C:/screenshots/screenshot_example4.png";

			FileUtils.copyFile(screenshot, new File(destinationpath));
			
			System.out.println("Screenshot taken and saved at: " + destinationpath);
			
			WebElement image = driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]"));
			
			File screenshot1 = image.getScreenshotAs(OutputType.FILE);
				
				String destinationpath1 = "C:/screenshots/screenshot_example5.png";

				FileUtils.copyFile(screenshot1, new File(destinationpath1));
				System.out.println("Screenshot taken and saved at: " + destinationpath1);

		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		//example();
		//eleSs();
		screenshotWholepage();
		
		driver.quit();
	}
}
