package Basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	private static final OutputType OutputType = null;
	private static final String File = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
	File ram=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Photo/amazon.png");
	FileUtils.copyFile(ram,dest);
	
	
driver.close();

	}

	public java.io.File getScreenshotAs(org.openqa.selenium.OutputType<java.io.File> file2) {
		// TODO Auto-generated method stub
		return null;
	}

}
