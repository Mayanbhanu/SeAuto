package basic2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillarypart1Pom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		SkillaryPart2 s= new SkillaryPart2(driver);
		s.loginbutton();
		s.username("admin");
		s.password("manager");
		s.loginbtn();
		
		
				

	}

}
