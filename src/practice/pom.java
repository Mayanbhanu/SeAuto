package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
	
	@FindBy(id="email")
	private WebElement usernamebtn;
	
	@FindBy(id="pass")
	private WebElement passwordbtn;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void usernamebutton(String username) {
		
		usernamebtn.sendKeys(username);
		
	}
	
public void passwordbutton(String password) 
{
		
		passwordbtn.sendKeys(password);
		
	}

public void loginbutton() {
	
	loginbtn.click();
	
}
	
	
	
	

}
