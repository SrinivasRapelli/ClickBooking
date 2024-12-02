package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	static WebDriver driver;
	
	public static void scrollToElement() throws InterruptedException {
		driver = new EdgeDriver();
		
		driver.get("https://www.ingroceries.co.uk/");
		driver.manage().window().maximize();
		
//		Actions action = new Actions(driver);
//		Thread.sleep(2000);
//		WebElement groceries = driver.findElement(By.xpath("//*[@id=\"comp-lnnlpl5t1label\"]"));
		//action.moveToElement(groceries).perform();
		Thread.sleep(3000);
//		driver.findElement(By.linkText("Drinks")).click();
//		Thread.sleep(3000);
		
		 WebElement word = driver.findElement(By.xpath("//*[@id=\"comp-lpmiyl7x6\"]/h2/span"));

		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 
		 js.executeScript("arguments[0].scrollIntoView(false);", word);
			  Thread.sleep(5000); 
			  word.click(); 
			  Thread.sleep(5000);
			 
		 
//		    action.scrollByAmount(0, 1500).perform();  // Scroll down by 500 pixels
//		    Thread.sleep(5000);
			
	        driver.quit();
	        
		
	}
	
	public static void scrolldown1() throws InterruptedException {
		driver = new EdgeDriver();
		
		driver.get("https://www.ingroceries.co.uk/");
		driver.manage().window().maximize();
		
		WebElement body = driver.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(4000);
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(4000);
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(4000);
		//System.out.println(message.getText());
	}
	
	public static  void scroolDowntoPage() throws InterruptedException {
		driver = new EdgeDriver();
		
		driver.get("https://www.ingroceries.co.uk/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(4000);
	}
	
	public static void scrollToELementByUsingActionClass() throws InterruptedException {
		
		driver = new EdgeDriver();
		
		driver.get("https://www.ingroceries.co.uk/");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		WebElement element = driver.findElement(By.xpath("//*[@id=\"comp-kmyqh4dq\"]/p/span"));
		
		Actions actions = new Actions(driver);		
		actions.moveToElement(element).moveByOffset(1000, 0).perform();
		
		Thread.sleep(4000);
//		element.click();
		driver.findElement(By.linkText("Terms & Conditions")).click();
		Thread.sleep(5000);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		scrollToElement();
		
		//scrolldown1();
		//scroolDowntoPage();
		//scrollToELementByUsingActionClass();
		driver.quit();
	}
}
