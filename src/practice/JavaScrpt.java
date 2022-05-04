package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class JavaScrpt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	WebElement ele1=	driver.findElement(By.xpath("(//img[contains(@class,'image')])[15]"));
	 org.openqa.selenium.Point loc1=ele1.getLocation();
	 
	int x= loc1.getX();
	int y= loc1.getY();
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollby("+x+","+y+")");
	Thread.sleep(2000);
	ele1.click();
	
	
	
	 
	 
	
	

	}

}
