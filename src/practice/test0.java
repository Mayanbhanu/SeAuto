package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test0 {
	
	WebDriver driver;
	@BeforeMethod
	public void OpenApp()
	{
		driver= new ChromeDriver();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
	}
	
	@Test
	public void tc1()
	{
		
	}
	
	@AfterMethod
	public void closeApp()
	{
		
	}
}
