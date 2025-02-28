package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CustomWaitsSelenium {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
		
		//Add Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//Load the URL of app
		driver.get("https://www.saucedemo.com/");
		
		//Wait for WebElement
		WebElement element=driver.findElement(By.id("user-name"));
		
		//use custom wait
		waitAndClick(element);
	}
	
	//Create Custom wait
	public static void waitAndClick(WebElement element) throws InterruptedException {
		int count=0; //1
		
		while(count<5) //true
		{
			try {
				element.click(); //not clicked it will give exception
				System.out.println("element clicked");
				break;
			}catch(Exception e)
			{
				Thread.sleep(1000); //poll every 1sec
				System.out.println("not clicked");
				count++;
			}
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
