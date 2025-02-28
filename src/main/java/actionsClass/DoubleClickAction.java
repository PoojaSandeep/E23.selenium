package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
		
		//Load the URL of app
		driver.get("https://demoapp.skillrary.com/product.php?product=java ");
		
		//Identify the web elements
		WebElement addEle=driver.findElement(By.id("add"));
		
		WebElement minusEle=driver.findElement(By.id("minus"));
		
		//Double click on web element
		Actions act= new Actions(driver);
		
		act.doubleClick(addEle).perform();
		System.out.println("double click on add");
		
		Thread.sleep(2000);
		
		act.doubleClick(addEle).perform();
		System.out.println("double clickon add again");
		
		Thread.sleep(2000);
		
		act.doubleClick(minusEle).perform();
		System.out.println("double click on minus");	
		
	}

}
