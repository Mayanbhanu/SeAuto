package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assrt {
	
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
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
	String title=	driver.getTitle();
	Assert.assertEquals(title,"Facebook helps you connect and share with the people in your life.");

	
	//SoftAssert s= new SoftAssert();
	//s.assertEquals(title,"12345lkjhg");
	
	String url=	driver.getCurrentUrl();
	Reporter.log(url,true);
	Reporter.log(title,true);
	
	
		
	}
	
@AfterMethod
public void closeApp()
{
	driver.quit();
}
}
