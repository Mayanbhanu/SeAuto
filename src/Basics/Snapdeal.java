package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
	WebElement ele=	driver.findElement(By.xpath("//div[contains(@class,'accountInner')]"));
	Actions a= new Actions(driver);
	a.moveToElement(ele).perform();
	
		
		
	
		
		
		
		
		
		
		
		
	}

}
