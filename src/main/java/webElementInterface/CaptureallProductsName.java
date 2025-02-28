package webElementInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CaptureallProductsName {
	public static void main(String[] args) {
		
		//Launch the browser
				WebDriver driver=new EdgeDriver();
				
				//maximize Browser
				driver.manage().window().maximize();
				
				//Load the URL of app
				driver.get("https://www.saucedemo.com/");
				
				//Login to the App
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
				
				//capture all the product names
				List<WebElement> allproducts=driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
				
				//individually navigate to each element and operate
				for(WebElement prod:allproducts)
				{
					//printing individual product name in console
					String productName= prod.getText();
					System.out.println(productName);
				}
	}

}
