package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	WebElement element=	driver.findElement(By.id("email"));
	
	if(element.isDisplayed())
	{
System.out.println("pass: username element is displayed");
	}
	else
	{
		System.out.println("fail: username element is displayed");
	}
	
	driver.close();
}
}
