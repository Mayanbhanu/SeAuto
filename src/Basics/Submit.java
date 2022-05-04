package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
	WebElement element =driver.findElement(By.id("username"));
	element.clear();
	WebElement element1 =driver.findElement(By.id("password"));
	element1.clear();
	WebElement element2=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	element2.submit();
	driver.close();
	
	
	
	
	}

}
