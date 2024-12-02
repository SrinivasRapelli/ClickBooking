package examples;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWaits {

	static WebDriver driver;
	
	public static void implicitWait() throws InterruptedException {
		driver = new EdgeDriver();
		
        driver.get("https://www.ingroceries.co.uk/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		 driver.findElement(By.linkText("Groceries")).click();
		 Thread.sleep(5000);
	}
	
	public static void ExplicitWait() throws InterruptedException {
		driver = new EdgeDriver();
		
        driver.get("https://www.ingroceries.co.uk/");
        driver.manage().window().maximize();
        
        By household = By.xpath("//*[@id=\"comp-lpiboghe1\"]/h2/span");
       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(household));
        
        System.out.println(ele.getText());
		 driver.findElement(By.linkText("Groceries")).click();
		 
	}
	public static void example() throws InterruptedException {
		driver = new EdgeDriver();
		
		driver.get("https://www.ingroceries.co.uk/");

	        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			
			 driver.findElement(By.linkText("Groceries")).click();
			 Thread.sleep(3000);
	}
	
	public static void fluentWait() throws InterruptedException {
		driver = new EdgeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.className("text-center"));
			}
		});
				System.out.println(ele.getText());		
				Thread.sleep(5000);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		//implicitWait();
		//ExplicitWait();
		//example();
		fluentWait();
		driver.quit();
	}
	
}
