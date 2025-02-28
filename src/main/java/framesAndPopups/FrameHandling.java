package framesAndPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
			
		//Load the URL of app
		driver.get("https://jqueryui.com/droppable/");
		
		//Switch the selenium control to frame
		driver.switchTo().frame(0);
		System.out.println("Control Switched to frame");
		
		Thread.sleep(1000);
		
		//Identify the drag and drop elements
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		//Perform Drag and Drop elements
		Actions act=new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
		System.out.println("drag and drop action done");
		
		//Switch the selenium control back to main page
		driver.switchTo().defaultContent();
		System.out.println("control back to main page");
		
		Thread.sleep(2000);
		
		//Click on any web page element
		driver.findElement(By.linkText("Simple photo manager")).click();
		
		
		
		
	}

}
