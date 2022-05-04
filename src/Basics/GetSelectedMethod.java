package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSelectedMethod {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	 WebElement  radiobutton =  driver.findElement(By.xpath("//label[text()='Female']"));
	
	if(radiobutton.isSelected())
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");

	}
	
	driver.close();

}
}
