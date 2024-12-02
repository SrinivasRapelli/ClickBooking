package examples;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderExample {

	static WebDriver driver;
	
	public static void example() throws InterruptedException {
		driver = new EdgeDriver();
		
		driver.get("https://www.w3schools.com/howto/howto_js_rangeslider.asp");
		driver.manage().window().maximize();
		WebElement  slider = driver.findElement(By.xpath("//*[@id=\"id2\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(slider);
		Thread.sleep(3000);
//		int x=20;
//		act.clickAndHold(ele).moveByOffset(x, 2).release().perform();
		
		int sliderWidth = slider.getSize().getWidth();
		System.out.println(sliderWidth);
		// Calculate the offset to move the slider handle
		int targetOffset = (int) (sliderWidth * 0.70);  // For 75% of the slider track

		// Move the slider to 75% position
		act.clickAndHold(slider).moveByOffset(-targetOffset, 0).release().perform();
		
		Thread.sleep(4000);
		driver.quit();
	}
	
	
	public static void slidingByKeys() throws InterruptedException {
		driver = new EdgeDriver();
		
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
		slider.click();
		Thread.sleep(3000);
		//actions.moveToElement(slider );
		actions.sendKeys(Keys.HOME).perform();
		Thread.sleep(3000);
		
		for (int i = 0; i < 60; i++) {
			actions.sendKeys(Keys.RIGHT).perform();
		}
		Thread.sleep(3000);

	}
	
	public static void slidingByjs() throws InterruptedException {
		driver = new EdgeDriver();
		
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		
		//Actions actions = new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = arguments[1];", slider, "90");
		Thread.sleep(3000);

	}
	
	
	public static void main(String[] args) throws InterruptedException {
		//example();
		slidingByKeys();
		//slidingByjs();
		driver.quit();
	}
}
