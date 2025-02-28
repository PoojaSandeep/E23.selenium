package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropAction {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
		
		//Load the URL of app
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement srcEle=driver.findElement(By.xpath("//div[.='Washington'][2]"));
		
		WebElement tarEle=driver.findElement(By.xpath("//div[.='United States']"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(srcEle, tarEle).perform();
		
		System.out.println("Drag and Drop Action is performed");
	}

}
