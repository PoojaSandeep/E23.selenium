package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RelativeXpath_Locator {
	
	public static void main(String[] args) {
		
		//Login to swag labs using relative xpath
		//Launch Browser
				WebDriver driver=new EdgeDriver();
				
				//Load URl
				driver.get("https://www.saucedemo.com/");
				
				//maximize the window
				driver.manage().window().maximize();
				
				//Identify User name TextField by Relative Xpath Selector
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");	
				
				//Identify Password TextField by Relative Xpath Selector
				driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");	
				
				//Click On Login Link web element
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				
				
	}

}
