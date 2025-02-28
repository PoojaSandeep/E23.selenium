package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {

		//Username = admin , password = admin
		//syntax is- https://username:password@url
		
		// launch browser
		WebDriver driver = new EdgeDriver();

		// maximize
		driver.manage().window().maximize();

		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// load url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
