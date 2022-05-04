package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	WebElement element=	driver.findElement(By.id("email"));
	 Dimension S = element.getSize();
	 
	 System.out.println(S.getHeight());
	 System.out.println(S.getWidth());
	 driver.close();
	 
	 

	}

}
