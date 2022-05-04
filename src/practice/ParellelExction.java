package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParellelExction {
	
	WebDriver driver;
	@Parameters ({"browsername"})
	@Test
	public void tc1(String broswer) {
		
		if(broswer.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver= new FirefoxDriver();
		}
		
	
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		 String title=driver.getTitle();
		String url= driver.getCurrentUrl();
		Reporter.log(title,true);
		Reporter.log(url,true);	
		
	
	}

}
