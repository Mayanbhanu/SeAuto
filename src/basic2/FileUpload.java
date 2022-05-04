package basic2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method 
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22536");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
Runtime.getRuntime().exec("C:\\Users\\Bhanu priya KR\\Desktop\\naukripopup\\naukripopup.au4.exe");

	
	
	
	

		
		
		
		
		
		
		

	}

}
