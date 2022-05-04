package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Apopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
	WebElement ele=	driver.findElement(By.id("course"));
	Actions a = new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[contains(text()='Selenium Training')]")).click();
	driver.findElement(By.xpath("//*[@id=\"productForm\"]/div/button")).click();
	
Alert a1=	driver.switchTo().alert();
	a1.accept();
	
	
	
	
	

	}

}
