package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringAction {
	
	public static void main(String[] args) throws InterruptedException {
		 //launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
		
		//Load the URL of app
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		//Identify Electronics and mouse hover on Electronics
		WebElement targetEle=driver.findElement(By.xpath("//span[.='Electronics']"));
		
		//Create Object of Action Class
		Actions act=new Actions(driver);
		
		//PerformMouseHovering
		act.moveToElement(targetEle).perform();
		System.out.println("Mouse Hovering Complete");
		
		//Thread.sleep(2000);
		
		//Click on wired hand phones after mouse By
		driver.findElement(By.linkText("Wired Headphones")).click();
		System.out.println("Clicked on Wired Headphones");
	}

}
