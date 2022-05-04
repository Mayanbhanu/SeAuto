package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sequential {
	
	WebDriver driver;
	
	@BeforeMethod
	public void OpenApp()
	{
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	public void tc1()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		 String title=driver.getTitle();
		String url= driver.getCurrentUrl();
		Reporter.log(title,true);
		Reporter.log(url,true);	
	}
	
@AfterMethod
public void CloseApp()
{
	driver.quit();
}

	
}

