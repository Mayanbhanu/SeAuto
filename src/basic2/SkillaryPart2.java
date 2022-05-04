package basic2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryPart2 {

	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginbtn1;
	
	@FindBy(id="email")
	private WebElement usernametf;
	
	@FindBy(name="password")
	private WebElement passwordtf;
	
	@FindBy(name="login")
	private WebElement loginbutton;
	
	
	public SkillaryPart2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void loginbutton() {
		loginbtn1.click();
	}
	public void username(String username) 
	{
		usernametf.sendKeys(username);
	}
	
	public void password(String password) 
	{
		passwordtf.sendKeys(password);
	}
	
	
	public void loginbtn() 
	{
		loginbutton.click();
	}
	
		
		
		
	}


