package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginScript {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys("bhanupriya7259@gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("bhanupriya7259@gmail.com");
		

	}

}
