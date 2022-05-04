package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	WebElement ele= driver.findElement(By.id("course"));
	Actions a = new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.xpath("(//a[contains(text(),'Selenium Training')])[1]")).click();
	WebElement plusbutton=driver.findElement(By.id("add"));
	Thread.sleep(4000);
	Actions b = new Actions(driver);
	Thread.sleep(4000);
	b.doubleClick(plusbutton).perform();
	driver.close();
	

	}

}
