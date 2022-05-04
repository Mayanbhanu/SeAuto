package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomElement1 {

	public static <PomElement> void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		PomElemet p=new PomElemet(driver);
		p.loginbutton();
		p.usernamebutton("admin");
		p.passwordbutton("manager");
		p.submitbutton();
		
		
		

	}

}
