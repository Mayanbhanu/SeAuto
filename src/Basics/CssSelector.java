package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		
			
			WebDriver driver=new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://www.facebook.com/");
					driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("7411237643");
					driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Abc@123");
                    driver.findElement(By.cssSelector("button[value='1']")).click();
                    driver.close();

	}

}