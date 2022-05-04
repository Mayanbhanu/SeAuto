package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchbackto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
	    WebElement ele=	driver.findElement(By.xpath("//span[contains(@class,'accountUserName')]"));
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[contains(@class,'accountBtn')]")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("7259506970");
		driver.switchTo().defaultContent();
		driver.findElement(By.name("keyword")).sendKeys("phone");
		driver.close();
		
		
		
	
		
		
				
			
		
	}

}
