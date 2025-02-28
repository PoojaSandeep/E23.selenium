package browserLaunching;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// Set the path to the Edge WebDriver executable
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\sandeep\\eclipse-workspace\\edgedriver_win64\\msedgedriver.exe");
		 // Configure Edge options
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
		
		//Launch Edge Browser
		WebDriver driver = new EdgeDriver();
		
		//To Load the URL
		driver.get("https://www.flipkart.com/");
		
		//To fetch the page title
		String title = driver.getTitle();
		System.out.println(title);
		
		//To fetch the current URL 
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

		//To close the current window of browser
		//driver.close();
		
		//To close all the open windows of browser
		//driver.quit();
		
		//To get the page source of the App
		String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		//To get the main Window ID - to switch to windows
		String winID=driver.getWindowHandle();
		System.out.println(winID);
		
		//To get all windowIDs main along with child windows - popup
		Set<String> winIDs = driver.getWindowHandles();
		for(String win:winIDs)
		{
			System.out.println(win);
		}
		
		//Navigation Methods
		Navigation nav = driver.navigate();
		nav.refresh(); 
		System.out.println("page refreshed");
		
        nav.back();
        System.out.println("backward page");
        
        nav.forward();
        System.out.println("forward page");
		
        //nav.to("https://www.makemytrip.com/");
       //System.out.println("make my trip loaded");
        
        driver.navigate().refresh(); //method chaining
		
		//Manage methods
        Options op = driver.manage();
        Window wind = op.window(); // maximize,minimize,fullscreen
        Timeouts time = op.timeouts(); //add time delays
        
        //Window methods of Options
        wind.maximize();
        System.out.println("current page is maximized");
        
        wind.fullscreen();
        System.out.println("full screen");
        
        Thread.sleep(2000);
        wind.minimize();
        System.out.println("current page is minimised");
        
        driver.manage().window().maximize(); //method chaining  
        
        //switch Methods
        TargetLocator targetLoc = driver.switchTo();
        targetLoc.window(winID); //switch selenium control to this window
		
        driver.switchTo().window(winID); //method Chaining
		
	}

}