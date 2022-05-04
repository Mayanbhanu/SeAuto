package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	WebElement ele=	driver.findElement(By.id("twotabsearchtextbox"));
	
	if(ele.isDisplayed())
	{
		System.out.println("is pas");
		
	}
	
	else
	{
		System.out.println("is fail");
	}
	}

}
