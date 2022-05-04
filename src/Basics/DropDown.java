package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");


		driver.manage().window().maximize();
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement dropdwon=	driver.findElement(By.id("searchDropdownBox"));
	 Select s= new Select(dropdwon);
	 Thread.sleep(3000);
	 s.selectByIndex(3);
	 Thread.sleep(3000);
	 s.selectByValue("search-alias=amazon-devices");
	 Thread.sleep(3000);
	 s.selectByVisibleText("Appliances");
	 Thread.sleep(3000);
	  List<WebElement> alloptions=s.getOptions();
	  System.out.println(alloptions.size());
	  
	  for(WebElement b: alloptions)
	  {
		  System.out.println(b.getText());
	  }
	 
	 driver.close();
	 
	 
		

	}

}
