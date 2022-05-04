package practicetwo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Basics.TakeScreenShot;

public class TakeScreenshotshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakeScreenShot ts= (TakeScreenShot)driver;
	File ram	=ts.getScreenshotAs(OutputType.FILE);
	File dest = new File ("./Photo/amazon.png");
	FileUtils.copyFile(ram,dest);
	
	}

}
