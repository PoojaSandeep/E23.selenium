package waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitSelenium {
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
		
		//Add Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//Load the URL of app
		driver.get("https://www.saucedemo.com/");	
		
		//CheckURL with Fluent wait
		FluentWait wait =new FluentWait(driver);
		wait.pollingEvery(Duration.ofMillis(200));
		wait.pollingEvery(Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.urlContains("sauce"));
		System.out.println("condition satisfied");
		
		driver.quit();	
	}

}
