package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAction {
	public static void main(String[] args) throws InterruptedException {
		//launch browsers
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
			
		//Load the URL of app
		driver.get("https://demoqa.com/buttons");
		
		//Click and Hold Action
		WebElement trgele= driver.findElement(By.xpath("//button[.='Click Me']"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(trgele).perform(); // hold the click button
		
		Thread.sleep(2000);
		
		act.release().perform(); //Release the click button
		
	}
	

}
