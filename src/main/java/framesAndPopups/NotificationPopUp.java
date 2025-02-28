package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
		
		//Disable popup using browser settings
		EdgeOptions op = new EdgeOptions();
		op.addArguments("--disable-notifications");
		
		//launch browser
		WebDriver driver = new EdgeDriver(op);
		
		//maximize
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//load url
		driver.get("https://www.yatra.com/");
		
	}
}