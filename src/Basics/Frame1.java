package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[contains(text(),'Google Play')]")).click();
		driver.close();
		

	}

}
