package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		        //launch browser
				WebDriver driver=new EdgeDriver();
				
				//maximize Window
				driver.manage().window().maximize();
				
				//Load the URL of app
				driver.get("https://demoqa.com/select-menu");
				
				//Identify the Dropdown
				WebElement ssd=driver.findElement(By.id("oldSelectMenu"));
				
				//Use select class to handle
				Select s = new Select(ssd);
				
				Thread.sleep(1000);
				
				//select option by Index
				s.selectByIndex(7);
				System.out.println("Index 7 selected");
				
				Thread.sleep(1000);
				
				//Select option by Value
				s.selectByValue("4");
				System.out.println("Value 4 selected");
				Thread.sleep(1000);
				
				//select option by visible text
				s.selectByVisibleText("Magenta");
				System.out.println("Text Magenta  selected");
				
				//check if the dropdown is Single select or multi select
				boolean temp = s.isMultiple();
				if(temp == true)
				{
					System.out.println("Yay!Its a multi select dropdown");
				}
				else
				{
					System.out.println("Yay!Its a Single select dropdown");
				}
				
				//select - to get all that is in dropdown
				List<WebElement> list=s.getOptions();
				for(WebElement option:list)
				{
					String optionText=option.getText();
					System.out.println(optionText);
				}
	}

}
