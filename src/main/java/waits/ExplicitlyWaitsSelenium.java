package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitsSelenium {
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
		
		//Add Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//Load the URL of app
		driver.get("https://www.saucedemo.com/");		
		
		//check URL Using explicitly wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("sauce"));
		
		System.out.println("condition not satisfied");
		
		//Wait for WebElement
		WebElement ele=driver.findElement(By.id("user-name"));
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		System.out.println("Elemenet is clickable");
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		System.out.println("Element is visible");
		
		wait.until(ExpectedConditions.titleContains("Swag"));
		System.out.println("Element contains Swag");
		
		driver.quit();
		
		
		
		
		
	}

}
