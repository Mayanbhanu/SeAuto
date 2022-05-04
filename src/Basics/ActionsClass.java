package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	WebElement ele= driver.findElement(By.xpath("(//a[contains(text(),'Home & Living')])[1]"));
	Actions a = new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[contains(text(),'Bath Towels')]"));
	
	

	}

}
