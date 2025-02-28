package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TagName_LinkText_PartialLinkTextLocators {
public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new EdgeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.saucedemo.com/");
		
		//Identify the Title using TAGNAME locator
		WebElement title = driver.findElement(By.tagName("title"));
		
		//Get the text of the web element
		String text = title.getTagName();
		System.out.println(text);
		
		//Login to Swag Labs
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		Thread.sleep(2000);
		
		//Logout of Swag Labs
		//Identify the menu button
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		Thread.sleep(1000);
		
		//Identify About Link Using LINK TEXT locator
		//WebElement aboutLink = driver.findElement(By.linkText("About"));
		
		//Click On Logout Link web element
		//aboutLink.click();
		
		//Identify All Items link using PARTIAL LINK TEXT Locator
		WebElement itemsLink = driver.findElement(By.partialLinkText("Items"));
		
		//Click on all items web element
		//itemsLink.click();
		
	}


}
