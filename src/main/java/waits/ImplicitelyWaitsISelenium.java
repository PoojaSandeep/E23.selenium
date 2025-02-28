package waits;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ImplicitelyWaitsISelenium {
	public static void main(String[] args) throws IOException  {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
		
		//Add Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//Load the URL of app
		driver.get("https://www.amazon.in/");
		
		//Take Screen Shot
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		//temp location - default
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//Create dst location
		File dst=new File("C:\\Users\\sandeep\\eclipse-workspace\\BasicSeleniumE23\\ScreenShots\\takes2.png");
		
		//Copy the screenshot from src to dst
		FileHandler.copy(src, dst);
		System.out.println("screenshot taken");
		
		driver.quit();
	}

}
