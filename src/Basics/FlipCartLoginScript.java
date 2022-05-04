package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartLoginScript {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("9449446728");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("Love@123");
		driver.findElement(By.xpath("(//button[contains(@class,'2KpZ6l ')])[2]")).click();
	String Title=	driver.getTitle();
	System.out.println(Title);
	
	
	if(Title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
	{
		System.out.println("pass:home page is displayed");
		
	}
	
	else
	{
		System.out.println("fail:home page is not displayed");
	}


	
	String Url=	driver.getCurrentUrl();
	System.out.println(Url);
		driver.close();
	}

}
