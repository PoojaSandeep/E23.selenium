package autoSuggestions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CaptureHPLaptopsAmazon {
	
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
		
		//Load the URL of app
		driver.get("https://www.amazon.in/");
		
		//Inspect Textbox and find laptops
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops",Keys.ENTER);
		
		//Capture all for "Laptops"
		List<WebElement> list=driver.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
		
		//Navigate to each loop
		for(WebElement laptop:list)
		{
			//capture the laptop name
			String laptopname=laptop.getText();
			
			//check if its HP
			if(laptopname.contains("HP"))
			{
				laptop.click();
				break;
			}
		}
		
	}

}
