package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SampleBrowserLaunch {
	
	@Test
	public void demoLaunch()
	{
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
		
		//Add Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//Load the URL of app
		driver.get("https://www.makemytrip.com/");
		
	}

}
