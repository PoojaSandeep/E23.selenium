package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector_XpathLocators {
public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		WebDriver driver=new EdgeDriver();
		
		//Load URl
		driver.get("https://www.saucedemo.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Identify Username TextField by CSS Selector
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		System.out.println("username entered");
		
		//Identify Password TextFeild By CSS Selector
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		System.out.println("pass entered");
}
}
