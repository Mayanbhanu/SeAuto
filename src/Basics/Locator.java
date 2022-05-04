package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("bhanupriya7259@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("bhanu@123");
		driver.findElement(By.name("login")).click();
		driver.close();
		
		

	}

}
