package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 WebElement dropdown=driver.findElement(By.id("day"));
		
		Select s= new Select(dropdown);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByVisibleText("2");
		Thread.sleep(3000);
		s.selectByValue("6");
		Thread.sleep(3000);
		System.out.println(s.isMultiple());
		
		s.deselectByIndex(2);
		Thread.sleep(3000);
		s.selectByVisibleText("2");
		Thread.sleep(3000);
		s.selectByValue("6");
		Thread.sleep(3000);
		s.deselectAll();
		
		System.out.println("elements before sorting");
		List l= new ArrayList();
	
		List<WebElement> options=s.getOptions();
		System.out.println(options.size());
		
		for(WebElement b: options)
		{
			System.out.println(b.getText());
			l.add(b.getText());
			
		}
		
		Collections.sort(l);
		System.out.println("elements after sorting");
		System.out.println(l);

	}

}
