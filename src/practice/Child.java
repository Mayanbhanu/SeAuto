package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		
	String parent=	driver.getWindowHandle();
	System.out.println(parent);
	Set<String> child=driver.getWindowHandles();
	System.out.println(child);
		
		

	}

}
