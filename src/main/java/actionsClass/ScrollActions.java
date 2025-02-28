package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollActions {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
			
		//Load the URL of app
		driver.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		//Scroll downwards
		act.scrollByAmount(0, 2000).perform();
		
		Thread.sleep(2000);
		
		//Scroll Upwards
		act.scrollByAmount(0, -500).perform();
		
		//Scroll Right
		act.scrollByAmount(1000, 0).perform();
		
		//Scroll Left
		act.scrollByAmount(-500, 0).perform();
		
		//Scroll until a perticular Element
		
		WebElement refEle=driver.findElement(By.xpath("//img[@title='BrowserStack']"));
		act.scrollToElement(refEle).perform();
		
		
	}

}
