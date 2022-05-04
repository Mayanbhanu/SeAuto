package basic2;

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

public class Test2 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApp()

	{
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@Test
	public void tc2()
	
	{
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.name("email")).sendKeys("7259506971");
		driver.findElement(By.name("did_submit")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"face");
		//SoftAssert s= new SoftAssert();
		//s.assertEquals(title,"facebooklo");
		
		String url=driver.getCurrentUrl();
		Reporter.log(title,true);
		Reporter.log(url,true);
				
			}
	
	@AfterMethod
	public void CloseApp()
	
	{
		
		driver.quit();
	}
	
}
