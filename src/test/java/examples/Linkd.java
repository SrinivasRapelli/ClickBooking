package examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Linkd {
	
	static WebDriver driver;
	
	public static void example() throws InterruptedException {
      driver = new EdgeDriver();
		
        driver.get("https://demowebshop.tricentis.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
//			System.out.println(link.getText());
//			System.out.println(link.getAttribute("href"));
			
			String linkText = link.getText();
			String linkUrl = link.getAttribute("href");
			System.out.println("Link Text: "+ linkText +"   ||  Link Url: "+ linkUrl);
		}
		links.get(6).click();
		
		
//		for (int i = 0; i < links.size(); i++) {
//			System.out.println(links.ge));
//			System.out.println("=======");
//		}
		
		
		
		System.out.println(links.size());
		Thread.sleep(5000);
	}
	
	
	public static void amazon() throws InterruptedException {
		driver = new EdgeDriver();
		
        driver.get("https://www.amazon.in/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement link : links) {
			String linkText = link.getText();
			String linkUrl = link.getAttribute("href");
			
			System.out.println("LinkText: "+ linkText + "|| Link Url: "+linkUrl);
		}
		
		
		
		System.out.println(links.size());
		links.get(100).click();
		Thread.sleep(5000);
	}
	
	
	public static void example2() throws InterruptedException {
		driver = new EdgeDriver();
		
        driver.get("https://www.amazon.in/s?k=mobiles+under+100000&rh=n%3A1389401031&ref=nb_sb_noss");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//WebElement ele = driver.findElement(By.partialLinkText("Apple iPhone 16"));
		List<WebElement> links = driver.findElements(By.partialLinkText("Ultra"));
		Thread.sleep(2000);
		System.out.println(links.size());
		
		
		for (WebElement link : links) {
			String linkname = link.getText();
			String linkUrl = link.getAttribute("href");
			System.out.println( "Link name  "+linkname +" |||| Link Url: " +linkUrl);
			
			
		}
		
		
		
//		String linkname = links.get(0).getText();
//		String linkUrl = links.get(0).getAttribute("href");
//		System.out.println(linkname);
//		System.out.println(linkUrl);
		
		//links.get(0).click();
		
		
		Actions actions = new Actions(driver);
		//actions.moveToElement(ele).perform();
		

		//ele.click();
		Thread.sleep(5000);
		
		
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		example2();
		//amazon();
		//driver.quit();
	}
}
