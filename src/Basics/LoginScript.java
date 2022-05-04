package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("7411237643");
		driver.findElement(By.id("pass")).sendKeys("Rudra@123");
		driver.findElement(By.name("login")).click();
		String Title=driver.getTitle();
		System.out.println(Title);
		
		if(Title.equals("Facebook – log in or sign up"))
		{
			System.out.println("pass:home page is displayed");
			
		}
		
		else
		{
			System.out.println("fail:home page is not displayed");
		}
			
		

String url=driver.getCurrentUrl();
System.out.println(url);
driver.close();
		
		
		
		

	}

}
