package actionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveBtyOffsetAction {
	public static void main(String[] args) throws InterruptedException {
		        //launch browser
				WebDriver driver=new EdgeDriver();
				
				//maximize Window
				driver.manage().window().maximize();
				
				//Load the URL of app
				driver.get("https://www.makemytrip.com/");
				
				Thread.sleep(2000);
				
				//Avoid Popup using move by offset
				Actions act=new Actions(driver);
				
				//use move by Offset method
				act.moveByOffset(10, 10).click().perform();
				System.out.println("move by offset values by 10,10 and clicked");
				
				
				
				
	}

}
