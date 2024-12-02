package examples;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class windowsandtabs {

	static WebDriver driver;
	
	public static void navigatesToATab() throws InterruptedException {
		
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		
		String originalTab = driver.getWindowHandle();
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		
		for (String handle : driver.getWindowHandles()) {
		    if (!handle.equals(originalTab)) {
		        driver.switchTo().window(handle);
		       
		    }
		}
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
//		driver.switchTo().window(originalTab);
		driver.close();
		
		
		
		
		
	}
	
	
	public static void handlingWindows() throws InterruptedException {
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		String originalWindow = driver.getWindowHandle();
		
		driver.findElement(By.id("windowButton")).click();
		
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(originalWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(originalWindow);
		
	}
	
public static void getmessagefromWindow() throws InterruptedException {
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		String originalWindow = driver.getWindowHandle();
		
		driver.findElement(By.id("messageWindowButton")).click();
		
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(originalWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(3000);
		
		String message = driver.findElement(By.xpath("/html/body/text()")).getText();
		System.out.println(message);
		driver.close();
		driver.switchTo().window(originalWindow);
		Thread.sleep(3000);
		driver.close();
		
	}
	
	
	public static  void tabs() throws InterruptedException {
        driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		
		String originalTab = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		
		for(String rahul : driver.getWindowHandles()) {
			if (!rahul.equals(originalTab)) {
				driver.switchTo().window(rahul);
			}
		}
		
		Thread.sleep(3000);
		
		
		WebElement successmsg = driver.findElement(By.id("sampleHeading"));
		System.out.println(successmsg.getText());
		
		driver.switchTo().window(originalTab);
		Thread.sleep(3000);
		
		driver.findElement(By.id("windowButton")).click();
		
		for(String rahul : driver.getWindowHandles()) {
			if (!rahul.equals(originalTab)) {
				driver.switchTo().window(rahul);
			}
		}
		
		Thread.sleep(3000);
		WebElement successmsg1 = driver.findElement(By.id("sampleHeading"));
		System.out.println(successmsg1.getText());
		
		
		
		driver.switchTo().window(originalTab);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		//navigatesToATab();
		//handlingWindows();
		//getmessagefromWindow();
		tabs();
	}
	
	
}
