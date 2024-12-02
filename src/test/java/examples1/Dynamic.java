package examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dynamic {
static WebDriver driver;
	
	public static void example() throws InterruptedException {
      driver = new EdgeDriver();
		
        driver.get("https://demowebshop.tricentis.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String ele = driver.findElement(By.xpath("//*[contains(text(), 'cool')]")).getText();
		System.out.println(ele);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		example();
		driver.quit();
	}
}
