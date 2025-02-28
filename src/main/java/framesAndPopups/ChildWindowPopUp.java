package framesAndPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildWindowPopUp {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
		
		//Add Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//Load the URL of app
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		
		driver.findElement(By.xpath("//button[.=\"click\"]")).click();
		
		//Capture the main window
		String mainwindowID=driver.getWindowHandle();
		System.out.println("This is main" +mainwindowID);
		
		//Capture all window ID's
		Set<String> allwindowIDs=driver.getWindowHandles();
		System.out.println("This is main" +mainwindowID);
		
		//Switch to Child window
		for (String win:allwindowIDs)
		{
			if(!win.equals(mainwindowID))
			{
				driver.switchTo().window(win);
				System.out.println("This is child" +win);
				break;
			}
		}
		
		//Click on download in child
		driver.findElement(By.xpath("//span[.=\"Downloads\"]")).click();
		System.out.println("Clickedon Child window Downloads");
		
		Thread.sleep(1000);
		
		//Switch the control back to main window
		driver.switchTo().window(mainwindowID);
		System.out.println("Switched to main window back");
		
		//click on multiple data link in main window
		driver.findElement(By.linkText("Open Seperate Multiple Windows")).click();
		System.out.println("Clicked on main windows open seperate multiple");
		
		
		
		
		
		
			
			
		
		
		
	}
	

}
