package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG  {

	public WebDriver driver;

	@BeforeSuite
	public void openBrowser() {

		driver = new EdgeDriver();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
//
//	@Test(priority = 1 , enabled = true)
//	public void clickOnRegister() throws InterruptedException {
//
//		Thread.sleep(3000);
//		driver.findElement(By.className("ico-register")).click();
//	}
//
//	@Test(priority = 2, enabled = false)
//	public void enterEmailData() {
//		driver.findElement(By.id("Email")).sendKeys("sri@gmail.com");
//
//	}
//
//	@Test(priority = 3)
//	public void clickOnLogin() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.className("ico-login")).click();
//	}
//
//	@Test(priority = 4)
//	public void enterLoginData() {
//		driver.findElement(By.id("Email")).sendKeys("sri@gmail.com");
//
//	}
//
//	@Test(priority = 5)
//	public void clickOnBooks() throws InterruptedException {
//		driver.findElement(By.linkText("BOOKS")).click();
//	}
//
//	@Test(priority = 6)
//	public void quitTheBrowser() throws InterruptedException {
//		Thread.sleep(3000);
//
//		driver.quit();
//	}
//	
	
	
	
	
	
	
	 @DataProvider(name = "loginDataProvider")
	    public Object[][] loginDataProvider() {
	        return new Object[][] {
	            { "sri@gmail.com", "password1" },
	            { "test@example.com", "password2" },
	            { "user@example.com", "password3" }
	        };
	    }
	 
	 @DataProvider(name = "logindata")
	 public Object[][] logindata(){
		 return new Object[][] {
			 {"srini@ksdd","123456"},
		 };
	 }
	 
	 
	 
	 @Test( dataProvider ="logindata" )
		public void clickOnLogin(String email, String password) throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.className("ico-login")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			}
	
	 @AfterSuite
	 public void closeBrowser() {
		 driver.quit();
	 }

}