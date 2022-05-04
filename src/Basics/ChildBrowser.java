package Basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args, Object windowType) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
		//new window
		
		driver.get("https://www.myntra.com/");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child=driver.getWindowHandles();
		System.out.println(child);
		
		driver.close();
		

	}

}
