package framesAndPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch browser
		WebDriver driver = new EdgeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//load app
		driver.get("https://www.shine.com/registration/");
		
		//identify the web element
		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
		
		Thread.sleep(2000);
	
	    //upload the file using file location
		upload.sendKeys("C:\\Users\\sandeep\\Desktop\\ReturnTicketMantralayam.pdf");
				
		System.out.println("File Upload successfull");
	
	
	
	
	
	
	
	
	
	
	}

}