package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prlel {
	
	WebDriver driver;
	@Parameters ({"broswername"})
	@Test
	public void tc(String Broswer)
	{
		if(Broswer.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		 String title=driver.getTitle();
		String url= driver.getCurrentUrl();
		Reporter.log(title,true);
		Reporter.log(url,true);	
		
	}
	
	

}
