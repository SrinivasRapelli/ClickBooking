package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	static WebDriver driver;
	
	
	public void register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\clickBooking\\drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Srini");
		driver.findElement(By.id("LastName")).sendKeys("R");
		driver.findElement(By.id("Email")).sendKeys("srinaskjdbs@g.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\clickBooking\\drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("srinaskjdbs@g.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		//driver.findElement(By.className("button-1 login-button")).click();
		driver.findElement(By.cssSelector("input.button-1.login-button")).click();

		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.findElement(By.className("ico-logout")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Register r = new Register();
		r.login();
	}
}
