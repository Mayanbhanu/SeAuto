package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledmethod {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	WebElement searchbutton=	driver.findElement(By.id("gh-btn"));
	
	if(searchbutton.isEnabled())
	{
	
System.out.println("pass:search button is enabled");
	}
	
	else
	{
		System.out.println("fail:search button is enabled");	
	}
	
	driver.close();
	}

}
