package Basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownGetText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	WebElement  dropdown =driver.findElement(By.id("year"));
	Select s= new Select(dropdown);
	s.selectByIndex(0);
	Thread.sleep(3000);
	s.selectByValue("2020");
	Thread.sleep(3000);
	s.selectByVisibleText("2017");
	System.out.println(s.getAllSelectedOptions());
	
	System.out.println(s.isMultiple());
	
	 List<WebElement> alloptions=s.getOptions();
	 
	 System.out.println(alloptions.size());
	 
	 List Ele= new ArrayList();
	 System.out.println("Elemets before sorting");
	 
	 
	  for(WebElement b: alloptions)
	  {
		  
		  System.out.println(b.getText());
		  Ele.add(b.getText());
	  }
	  
	  Collections.sort(Ele);
	  System.out.println("Elemets after sorting");
	  System.out.println(Ele);
	  
	  
	  driver.close();
	  
	  
		 

	}

}
