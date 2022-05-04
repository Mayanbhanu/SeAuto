package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown2 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");


		driver.manage().window().maximize();
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement dropdwon=	driver.findElement(By.id(""));
	 Select s= new Select(dropdwon);
	
	 s.selectByIndex(3);
	
	 s.selectByValue("search-alias=amazon-devices");
	
	 s.selectByVisibleText("Appliances");
	
	 
	System.out.println( s.isMultiple());
	  
	 
	 
	 driver.close();
	 
	 
		

	}

}


	


