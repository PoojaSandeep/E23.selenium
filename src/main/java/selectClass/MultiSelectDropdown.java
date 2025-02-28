package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		 //launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize Window
		driver.manage().window().maximize();
		
		//Load the URL of app
		driver.get("https://demoqa.com/select-menu");
		
		//Identify the Dropdown
		WebElement msd=driver.findElement(By.id("cars"));
		
		//Use select class to handle
		Select m = new Select(msd);
		
		//check if the dropdown is Single select or multi select
		boolean temp = m.isMultiple();
	
		if(temp == true)
		{
			System.out.println("Yay!Its a multi select dropdown");
		}
		else
		{
			System.out.println("Yay!Its a Single select dropdown");
		}
		
		//select option by Index
		m.selectByIndex(0);
		System.out.println("Index 0 selected");
		
		Thread.sleep(1000);
		
		//Select option by Value
		m.selectByValue("audi");
		System.out.println("Audi Value selected");
		Thread.sleep(1000);
		
		//select option by visible text
		m.selectByVisibleText("Opel");
		System.out.println("Opel Visible Text selected");
		
		//get First Selected Option
		WebElement firstOp=m.getFirstSelectedOption();
		System.out.println(firstOp.getText());
		
		//Get all Selected Options
		List<WebElement> selectedList=m.getAllSelectedOptions();
		for(WebElement selected:selectedList)
		{
			System.out.println(selected.getText());
		}
		
		//gtWrapperElements - get allthe webelements inside base element
		WebElement wrappedEle=m.getWrappedElement();
		System.out.println(wrappedEle.getText());
		
		
	
		
		
	}

}
