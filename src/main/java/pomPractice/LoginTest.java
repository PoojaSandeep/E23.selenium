package pomPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
	public static void main(String[] args) throws IOException {
		
		//read the data
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		
		//Create Object of Properties Class-Java .util
		Properties p=new Properties();
				
		//Load the file to Properties Class
		p.load(fis);
				
		//Provide the key and capture the value
		String URL=p.getProperty("url");
		System.out.println(URL);
				
		String USERNAME=p.getProperty("username");
		System.out.println(USERNAME);
		
		String PASSWORD=p.getProperty("password");
		System.out.println(PASSWORD);
		
		//Launch Browser
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load URL
		driver.get(URL);
		
		//Login to Application
		//driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		//driver.findElement(By.id("password")).sendKeys(PASSWORD);
		//driver.findElement(By.id("login-button")).click();
		
		LoginPage lp= new LoginPage(driver);
		lp.getUsernameTextField().sendKeys(USERNAME);
		lp.getPasswordTextFeild().sendKeys(PASSWORD);
		lp.getLoginButton().click();
		
		
	}

}
