package examples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class WebTesting {

	static WebDriver driver;
	

	
	public static void example() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\clickBooking\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.findElement(By.className("ico-login")).click();
//		driver.findElement(By.id("Email")).sendKeys("ravirao123@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("ravi@123");
//		driver.findElement(By.id("RememberMe")).click();
//		driver.findElement(By.cssSelector("input.button-1.login-button")).click();
//		
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("BOOKS")).click();   
//		driver.findElement(By.linkText("Computing and Internet")).click();
//		driver.findElement(By.cssSelector("input#add-to-cart-button-13.button-1.add-to-cart-button")).click();
//		driver.findElement(By.className("ico-cart")).click();
//		driver.findElement(By.id("termsofservice")).click();
//		driver.findElement(By.id("checkout")).click();
 
		// Thread.sleep(5000);  	
		WebElement ele = driver.findElement(By.linkText("COMPUTERS"));
	
		Actions actions = new Actions(driver);
		
		actions.moveToElement(ele).perform();
		actions.dragAndDrop(ele, ele);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Desktops")).click();
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.name("products-orderby"));
		Select dd = new Select(element);	
		dd.selectByVisibleText("Created on");
		
		Thread.sleep(5000);
		
		WebElement element1 = driver.findElement(By.name("products-orderby"));
		Select dd1 = new Select(element1);
		//dd1.selectByIndex(1);
//		dd.
		
		dd1.selectByValue("https://demowebshop.tricentis.com/desktops?orderby=11");
		Thread.sleep(5000);

		driver.quit();
	}
	
	
	public static void radioButton() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//*[@class=\"card-up\"])[1]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//*[@id=\"item-2\"]/span)[1]")).click();
        Thread.sleep(10000);
        
        
        WebElement yesRadio = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/label"));
        if (yesRadio.isDisplayed()) {
    	   System.out.println("displayed");
    	   yesRadio.click();
    	   
    	   WebElement successmessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/p"));
    	   System.out.println(successmessage.getText());
        }
        else {
    	   System.out.println("not displayed");
        }
        
        
        
        if (yesRadio.isSelected()) {
     	   System.out.println("Selected");
     	  
         }
         else {
     	   System.out.println("not displayed");
         }
        
       
       
        WebElement noRadio = driver.findElement(By.id("noRadio"));
        
        if (noRadio.isEnabled()) {
			System.out.println("Clickable");
		}
        else {
        	System.out.println("unclickable");
        }
        
        
	}
	
	
	
	public static void uploadDownloadFile() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
        Thread.sleep(2000);
        driver.findElement(By.linkText("Download")).click();
        Thread.sleep(5000);
        
        WebElement chooseFile = driver.findElement(By.id("uploadFile"));
        String filePathe ="C:/Users/srini/OneDrive/Desktop/ss/Screenshot 2024-06-24 203052.png";
       
        chooseFile.sendKeys(filePathe);
        Thread.sleep(10000);
        
        WebElement fileSuccess = driver.findElement(By.id("uploadedFilePath"));
        System.out.println(fileSuccess.getText());
        Thread.sleep(2000);
        
	}
	
	public static void clicking() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement doubleclickElement = driver.findElement(By.id("doubleClickBtn"));
		Thread.sleep(5000);
		actions.doubleClick(doubleclickElement).perform();
		
		WebElement successOdDoubleclick = driver.findElement(By.id("doubleClickMessage"));
		System.out.println(successOdDoubleclick.getText());
		Thread.sleep(5000);
	}
	
	
	public static void draganddrop() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		WebElement dragElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div"));
		//WebElement dropElement = driver.findElement(By.xpath(""));
		
	
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDropBy(dragElement, 100, 50);
		
		Thread.sleep(10000);
		
	    action.doubleClick().perform();
	}
	
	

	
	
	public static void main(String[] args) throws InterruptedException {
//		radioButton();
//		
		//uploadDownloadFile();
		
		
//		draganddrop();

		clicking();
		driver.quit();
	}
}
