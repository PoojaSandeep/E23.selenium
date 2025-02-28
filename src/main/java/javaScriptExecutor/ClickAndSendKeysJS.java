package javaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickAndSendKeysJS {

	public static void main(String[] args) {
		/*
		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// maximize window
		driver.manage().window().maximize();
		
		// Load the url
		driver.get("https://www.saucedemo.com/");
				
		//Identify all elements
		WebElement un = driver.findElement(By.id("user-name"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement loginbtn = driver.findElement(By.id("login-button"));
				
		//Login using JS
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='standard_user'", un);
		js.executeScript("arguments[0].value='secret_sauce'", pwd);
		js.executeScript("arguments[0].click();", loginbtn);
		*/
		
		// launch Browser
		WebDriver driver = new EdgeDriver();

		// maximize window
		driver.manage().window().maximize();

		// load URL
		driver.get("https://www.amazon.in/");

		// Identify search tab and enter data 'bluetooth earphones'
		WebElement searchBar=driver.findElement(By.xpath("//input[@aria-label='Search http://Amazon.in']"));
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		
		//Enter data using JS
		JavascriptExecutor js = (JavascriptExecutor) driver;
				
		js.executeScript("arguments[0].value='bluetooth earphones'", searchBar);
		js.executeScript("arguments[0].click()", searchBtn);
			
				
				
				
			}

		}


