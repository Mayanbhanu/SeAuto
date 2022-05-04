package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstaScrip {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement username=driver.findElement(By.name("username"));
		w.until(ExpectedConditions.visibilityOf(username)).sendKeys("bhanupriya7259@gmail.com");
		
		
		WebElement button=driver.findElement(By.name("password"));
		w.until(ExpectedConditions.visibilityOf(button)).sendKeys("Bh@123");
		WebElement element=driver.findElement(By.xpath("(//button[contains(@class,'sqdOP ')])[2]"));
		w.until(ExpectedConditions.elementToBeClickable(element)).click();
		String Title=driver.getTitle();
		System.out.println(Title);
		w.until(ExpectedConditions.titleContains("Insta"));
		
		
		
		if(Title.equals("Instagram"))
		{
			System.out.println("pass:home page is displayed");
			
		}
		
		else
		{
			System.out.println("fail:home page is not displayed");
		}	
		

String url=driver.getCurrentUrl();
System.out.println(url);

driver.close();
				

	}

}

		
		
		

