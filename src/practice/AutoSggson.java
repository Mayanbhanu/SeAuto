package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSggson {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
	WebElement e	=driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
			e.sendKeys("dres");
		List<WebElement> e1=	driver.findElements(By.xpath("//li[contains(text(),'Dress Western')]"));
			
	System.out.println(	e1.size());	
	for(WebElement b: e1)
	{
		System.out.println(b.getText());
	}
		

	}

}
