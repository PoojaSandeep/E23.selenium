package framesAndPopups;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopupcurrentDate {
	public static void main(String[] args) throws InterruptedException {
		Date d=new Date();
		String ds=d.toString();
		System.out.println(ds);
		
		String[] dArr=ds.split(" ");
		String CurrentDate=dArr[0]+" "+dArr[1]+" "+dArr[2]+" "+dArr[5];
		System.out.println(CurrentDate);
		
		// launch Browser
		WebDriver driver = new EdgeDriver();

		// maximize window
		driver.manage().window().maximize();
		
		//Add Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// load URL
		driver.get("https://www.makemytrip.com/");
		
		//Close add
		Actions act=new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		//Select the current date - Dynamic Xpath
		Thread.sleep(2000);
		WebElement ele= driver.findElement(By.xpath("//div[@aria-label='"+CurrentDate+"']"));
		
		Thread.sleep(2000);
		ele.click();
		
		
		
		
	}

}
