package basic2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchBack2PreviousFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	WebElement ele= driver.findElement(By.xpath("//span[text()='Sign In']"));
	Actions a= new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.xpath("//span[contains(@class,'accountBtn btn rippleWhite')]")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.id("userName")).sendKeys("7259506970");
	driver.findElement(By.xpath("driver.findElement(By.id(\"userName\"))")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.name("keyword")).sendKeys("phone");
	
	
	
	
	
	
	}

}
