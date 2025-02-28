package framesAndPopups;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUpFutureDate {
	public static void main(String[] args) throws InterruptedException {
		
			Date d= new Date();
			String ds=d.toString();
			System.out.println(ds);
			
			
			
			//launch browser
			WebDriver driver=new EdgeDriver();
			
			//maximize Window
			driver.manage().window().maximize();
			
			//Add Implicitly Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			//Load the URL of app
			driver.get("https://www.makemytrip.com/");
			
			//close add
			Actions act= new Actions(driver);
			act.moveByOffset(10, 10).click().perform();
			
			driver.findElement(By.xpath("//label[@for='departure']"));
			
			//select the current Date-Dynamic xpath
			Thread.sleep(1000);
	}

}
