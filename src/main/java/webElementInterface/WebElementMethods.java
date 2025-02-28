package webElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new EdgeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//Load the URL of App
		driver.get("https://www.saucedemo.com/");
		
		//WebElement - I - sendkeys() - enter data into textField
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		Thread.sleep(2000);
		
		//WebElement - I - clear() - erase the data entered in text field
		driver.findElement(By.id("user-name")).clear();
		
		//WebElement - I - click() - left click operation
		//driver.findElement(http://By.id("login-button")).click();
		
		//WebElemnt - I - getText() - used to get text of web element
		String text = driver.findElement(By.xpath("//div[@class='login_logo']")).getText();
		System.out.println("visible text is -> "+text);
		
		//WebElemnt - I - getAttribute() - used to get text of web element
		String attributeValue = driver.findElement(By.id("password")).getAttribute("placeholder");
		System.out.println("Attribute value is -> "+attributeValue);
		
		//WebElemnt - I - getTagName() - used to get tagName of web element
		String tagName = driver.findElement(By.id("password")).getTagName();
		System.out.println("Tag Name is -> "+tagName);
		
		//WebElement - I - getLocation() - Point class - to get the location 
		Point point = driver.findElement(By.id("password")).getLocation();
		int x=point.getX();
		int y=point.getY();
		System.out.println("location is "+x+","+y);
		
		//WebElement - I - getSize() - Dimension class - to get the size
		Dimension dimen = driver.findElement(By.id("password")).getSize();
		int h = dimen.getHeight();
		int w=dimen.getWidth();
		System.out.println("Size is "+h+","+w);
		
		//WebElement - I getRect() - Rectangle class get location and also size
		Rectangle rec = driver.findElement(By.id("password")).getRect();
		int rx = rec.getX();
		int ry = rec.getY();
		int rh = rec.getHeight();
		int rw = rec.getWidth();
		System.out.println("Location- "+rx+","+ry+" Size- "+rh+","+rw);
		
		//WebElement - I - getCSSValue() - give the CSS property value for particular property name
		String cssValue = driver.findElement(By.id("login-button")).getCssValue("background-color");
		System.out.println("CSS Value is "+cssValue);

		//WebElement - I - getAriaRole() - get the design of web element
		String arole = driver.findElement(By.id("login-button")).getAriaRole();
		System.out.println("AriaRole is "+arole);
		
		//WebElement - I - getAccessibleName() - get the value for attribute "value' in html code
		String accessName = driver.findElement(By.id("user-name")).getAccessibleName();
		System.out.println("Accessible Name is "+accessName);
		
		//WebElement - I - getDOMAttribute() - get the value of Attribute name given
		String domAttributeValue = driver.findElement(By.id("user-name")).getDomAttribute("data-test");
		System.out.println("DOM Attribute value is "+domAttributeValue);
		
		//WebElement - I - getDOMProperty() - get the DOM property value for given property name 
		String domProperty = driver.findElement(By.id("user-name")).getDomProperty("baseURI");
		System.out.println("DOM Property is "+domProperty);
		
		//WebElement - I - getShadowRoot() - get the shadow roots of web page
		SearchContext sroot = driver.findElement(By.id("user-name")).getShadowRoot();
		
		//WebElement - I - submit() - used to click() for type='submit'
		driver.findElement(By.id("login-button")).submit();
		System.out.println("submit executed");
		
		//WebElement - I isDisplayed() - check if element is displayed in DOM
		boolean display = driver.findElement(By.id("login-button")).isDisplayed();
		if(display==true)
		{
			System.out.println("element displayed in DOM");
		}
		else
		{
			System.out.println("element Not displayed in DOM");
		}
		
		//WebElement - I - isEnabled() - check if element is enabled in DOM
		boolean enable = driver.findElement(By.id("login-button")).isEnabled();
		if(enable==true)
		{
			System.out.println("element is enabled in DOM");
		}
		else
		{
			System.out.println("element is Not enabled in DOM");
		}
		
		//WebElement - I - isSelected() - check if element is selected 
		boolean select = driver.findElement(By.id("login-button")).isSelected();
		if(select==true)
		{
			System.out.println("element is selected");
		}
		else
		{
			System.out.println("element is Not selected");
		}
		
		
		
		
		
		
		
		
	}

}