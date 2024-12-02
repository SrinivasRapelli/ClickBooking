package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationCommands {

	static WebDriver driver;
	
	public static void navigationCommands() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "T");

		// first//
		driver.navigate().to("https://www.desiukconnect.co.uk/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
	}
	public static void main(String[] args) throws InterruptedException {
		navigationCommands();
		driver.quit();
	}
}
