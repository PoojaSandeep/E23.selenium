package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
			
		//Load the URL of app
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
		//Right Click Action
		WebElement targetEle=driver.findElement(By.xpath("//span[.='right click me']"));
		
		Actions act=new Actions(driver);
		act.contextClick(targetEle).perform();
		System.out.println("Right click performed");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[.='Edit']")).click();
}

}
