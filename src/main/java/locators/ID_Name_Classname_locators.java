package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class ID_Name_Classname_locators {
	
	public static void main(String[] args) {
		
		//Launch Browser
		WebDriver driver=new EdgeDriver();
		
		//Load URl
		driver.get("https://www.saucedemo.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Identify the username with ID Locator
		WebElement un=driver.findElement(By.id("user-name"));
		
		//Enter Data into identified Username - sendkeys() - WebElement
		un.sendKeys("standard_user");
		System.out.println("user name entered");
		
		//Identify the password text field with Name Locator
		 WebElement pwd=driver.findElement(By.name("password"));
		 pwd.sendKeys("secret_sauce");
		 System.out.println("pwd entered");
	}

}
