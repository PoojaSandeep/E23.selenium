package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSendKeysAction {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
			
		//Load the URL of app
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
		//Identify the Elements
		WebElement un=driver.findElement(By.id("user-name"));
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		
		Thread.sleep(2000);
		
		//Send Keys
		Actions act=new Actions(driver);
		
		//Enter Username and Password
		act.sendKeys(un,"standard_user",Keys.TAB,"secret_sauce").perform();
		Thread.sleep(2000);
		act.click(loginbtn).perform();
		
	
	}
	

}
