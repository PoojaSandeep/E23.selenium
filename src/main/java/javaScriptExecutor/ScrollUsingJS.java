package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollUsingJS {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// maximize window
		driver.manage().window().maximize();

		// Load the URL
		driver.get("https://www.selenium.dev/downloads/");
		
		//Using Java script Executor - scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scroll down
		js.executeScript("window.scrollBy(0,1000);", "");
		
		Thread.sleep(1000);
		
		//scroll Up
		js.executeScript("window.scrollBy(0,-1000);", "");
		
		Thread.sleep(1000);
		
		//scroll right
		js.executeScript("window.scrollBy(1000,0);", "");
		
		Thread.sleep(1000);
		
		//scroll Left
		js.executeScript("window.scrollBy(-1000,0);", "");		
		
	}

}
 