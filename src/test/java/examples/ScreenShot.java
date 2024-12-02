package examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShot{

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new EdgeDriver();
        
        try {
           
            driver.get("https://demowebshop.tricentis.com/");

           WebElement ele = driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]"));
            //File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
           File screenshot = ele.getScreenshotAs(OutputType.FILE);

           String destinationPath = "C:/screenshots/screenshot_example1.png"; 

           FileUtils.copyFile(screenshot, new File(destinationPath));

            System.out.println("Screenshot taken and saved at: " + destinationPath);
        } catch (IOException e) {
            System.out.println("Failed to save the screenshot: " + e.getMessage());
        } finally {
			driver.quit();
		}
    }
}