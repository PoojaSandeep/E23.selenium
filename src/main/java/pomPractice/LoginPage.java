package pomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//Rule1: Create a separate POM class for every web page
	
	//Rule2: Identify the web element using @FindBy - Declaration
	@FindBy(id="user-name")
	private WebElement usernameTextField;
	
	@FindBy(name="password")
	private WebElement passwordTextFeild;
	
	@FindBy(name="login-button")
	private WebElement loginButton;
	
	//Rule3: Create constructor for element initialization- Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Rule4:Provide getters and accessing the web elements- Utilization
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//pompractice - LoginTest
	 
	
	
	

}
