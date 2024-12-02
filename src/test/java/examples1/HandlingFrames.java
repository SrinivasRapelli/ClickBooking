package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	static WebDriver driver ;
	
	public static void handlingFrames() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\clickBooking\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).getText();
		System.out.println(msg);
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		
		String eleMsg  = driver.findElement(By.xpath("/html/body/section/div/h5")).getText();
		System.out.println(eleMsg);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Rahul");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		String heading = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).getText();
		System.out.println(heading);
		
//		Thread.sleep(3000);
//
//		driver.switchTo().frame(2);
//		Thread.sleep(3000);
//		
//		String msg2 = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
//		System.out.println(msg2);
//		
		driver.quit();
		
	}
	
	public static void frames() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\clickBooking\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String msg = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).getText();
		System.out.println(msg);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		//WebElement frame1 = driver.findElement(By.className("iframe-container"));
		
//		driver.switchTo().frame(0);
		driver.switchTo().frame("outerFrame");
		
		Thread.sleep(3000);
		String msg1 = driver.findElement(By.xpath("/html/body/section/div/div/h5")).getText();
		System.out.println(msg1);
		Thread.sleep(3000);
		
	}
	
	
	
	
	public static void handlingframes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\clickBooking\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		//handlingFrames();
		frames();
	}
}
