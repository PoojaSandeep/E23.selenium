package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDownAction {
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
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).perform();
		act.sendKeys(un,"abc").perform();
		act.keyUp(Keys.SHIFT).perform();
	}

}
