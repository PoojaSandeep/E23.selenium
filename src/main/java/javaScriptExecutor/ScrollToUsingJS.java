package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollToUsingJS {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// maximize window
		driver.manage().window().maximize();

		// Load the URL
		driver.get("https://www.selenium.dev/downloads/");

		// Scroll to extremes
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// extreme bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);", "");

		Thread.sleep(3000);

		// extreme up
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight);", "");

		
		// extreme right
		js.executeScript("window.scrollTo(document.body.scrollWidth,0);", "");

		Thread.sleep(3000);

		// extreme left
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0);", "");
	}

}