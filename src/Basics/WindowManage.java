package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:www.amazon.com/");
		
		
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	
		
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
