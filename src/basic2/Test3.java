package basic2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	
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
public void tc3()
{
	driver.findElement(By.linkText("Sign up for Facebook")).click();
	driver.findElement(By.name("firstname")).sendKeys("bhanupriya");
	driver.findElement(By.name("lastname")).sendKeys("kr");
	driver.findElement(By.name("reg_email__")).sendKeys("7259506971");
	driver.findElement(By.name("reg_email__")).sendKeys("7259506971");
	driver.findElement(By.id("password_step_input")).sendKeys("Choice@123");
	WebElement dropdown=driver.findElement(By.id("day"));
	Select s= new Select(dropdown);
	s.selectByValue("12");
	WebElement dropdown1=driver.findElement(By.id("month"));
	Select s1= new Select(dropdown1);
	s1.selectByVisibleText("Aug");
	
	WebElement dropdown2=driver.findElement(By.id("year"));
	Select s2= new Select(dropdown2);
	s2.selectByVisibleText("2012");
	
	driver.findElement(By.name("websubmit")).click();		
	
	
}

@AfterMethod
public void closeApp()
{
	driver.quit();
	
}

}
