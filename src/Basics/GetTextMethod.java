package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	
		public static void main(String[] args) {
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			 String element=driver.findElement(By.xpath("(//h2[contains(text(),'Facebook')])[1]")).getText();
			
			 System.out.println(element);
			 driver.close();
			

	}

}
