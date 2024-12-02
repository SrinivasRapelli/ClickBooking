package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
	static WebDriver driver;
	
	public static void example1() throws InterruptedException {
		
		driver = new EdgeDriver();
		
		driver.get("https://www.w3schools.com/howto/howto_js_rangeslider.asp");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"id1\"]"));
		
		int sliderLength = slider.getSize().getWidth();
		System.out.println(sliderLength);
		//slider.click();
		
		int targetvalue = (int) (sliderLength * 0.78); //50 %
		
		Actions actions = new Actions(driver);
		//actions.moveToElement(slider).perform();
		
		actions.clickAndHold(slider).sendKeys(Keys.HOME).build().perform();
		Thread.sleep(3000);
		actions.clickAndHold(slider).moveByOffset(900, 0).build().perform();
		Thread.sleep(3000);
		
		//actions.sendKeys(Keys.END).perform();
		Thread.sleep(5000);
		
	}
	
	
	public static void sliderBykeys() throws InterruptedException {
		driver = new EdgeDriver();
		
		driver.get("https://www.w3schools.com/howto/howto_js_rangeslider.asp");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"id2\"]"));
		
		int sliderLength = slider.getSize().getWidth();
		System.out.println(sliderLength);
		slider.click();
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.END).perform();
		Thread.sleep(4000);
		
		
		   for (int i = 0; i < 69; i++) { 
			    actions.sendKeys(Keys.ARROW_LEFT).perform();
		   }
		 	
		
		
		Thread.sleep(4000);
		
		actions.sendKeys(Keys.HOME).perform();
		Thread.sleep(4000);
	}
	
	public static void sliderJS() throws InterruptedException {
		driver = new EdgeDriver();
		
		driver.get("https://www.w3schools.com/howto/howto_js_rangeslider.asp");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"id2\"]"));
		
		int sliderLength = slider.getSize().getWidth();
		System.out.println(sliderLength);
		slider.click();
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.HOME).perform();
		Thread.sleep(4000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value = arguments[1];", slider, "10");
		
		Thread.sleep(4000);
		actions.sendKeys(Keys.END).perform();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		example1();
		//sliderBykeys();
		//sliderJS();
		driver.quit();

	}
}
