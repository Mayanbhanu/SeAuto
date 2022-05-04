package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomElemet {
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginbtn;
	
	
	@FindBy(id="email")
	private WebElement usernamebtn;
	
	@FindBy(name="password")
	private WebElement passwordbtn;
	
	@FindBy(name="login")
	private WebElement submitbtn;
	
	
	public PomElemet(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginbutton()
	{
		loginbtn.click();
		
	}
	
	public void usernamebutton(String username)
	{
		usernamebtn.sendKeys(username);
	}
	
	public void passwordbutton(String password)
	
	{
		passwordbtn.sendKeys(password);
	}
	
public void submitbutton( )
	
	{
		usernamebtn.sendKeys();
	}

}
