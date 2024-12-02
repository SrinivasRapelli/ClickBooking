package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	public WebDriver driver;
	
	
	@DataProvider(name = "logindata")
	public Object[][] logindata(){
		return new Object[][] {
			{"srini123@gmail.com","123456",},
			{"srin3@gmail.com","123456"},
			{"sr23@gmail.com","123456"}
		};
	}
	
	@Test(dataProvider = "logindata", groups = "smoke", description = "login with valid crededntials")
	public void login(String email, String password) throws InterruptedException {
		driver = new EdgeDriver();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(3000);
		driver.quit();
	}
}
