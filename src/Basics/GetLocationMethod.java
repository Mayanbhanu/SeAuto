package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	WebElement element=	driver.findElement(By.id("email"));
	  Point loc=(element.getLocation());
	  System.out.println(loc.getX()+"x axis cord");
	  System.out.println(loc.getY()+"y axis cord");
	  driver.close();
	  
	  

	}

}
