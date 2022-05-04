package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifcnp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		

	}

}
