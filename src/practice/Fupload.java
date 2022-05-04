package practice;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fupload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(text(),'Register')]")).click();
		
		WebElement ele=driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]"));
	 Point loc =   ele.getLocation();
int a =	 loc.getX();
	int b= loc.getY();
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollby("+a+","+b+")");
	ele.click();
		Runtime.getRuntime().exec("C:\\Users\\Bhanu priya KR\\Desktop\\naukripopup\\upload1.au4.exe");
		
	}

}
