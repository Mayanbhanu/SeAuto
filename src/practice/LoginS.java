package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.id("login")).click();
	String title=	driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();		
	System.out.println(url);
	if(title.equals("LoginScript.java"))
	{
		System.out.println("pass");
		
	}
	else
	{
		System.out.println("fail");
		
	}
		
		
		
		

	}

}
