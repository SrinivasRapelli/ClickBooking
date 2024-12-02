package examples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
    public static void main(String[] args) throws IOException {

    	String filePath = "C:/Users/srini/OneDrive/Desktop/data.xlsx";
        String sheetName = "Sheet1";

        ExcelData data = new ExcelData(filePath, sheetName);
        
        String email = data.getCellData(1, 0);
        String password = data.getCellData(1, 1);
        
        WebDriver driver = new EdgeDriver();
        driver.get("https://demowebshop.tricentis.com/login");

        WebElement emailField = driver.findElement(By.id("Email"));
        WebElement passwordField = driver.findElement(By.id("Password"));
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        loginButton.click();
        
        
    }
}