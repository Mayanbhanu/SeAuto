package basic2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg {
	
	@Test
	public void tc1()
	{
		Reporter.log("hello",true);
		Reporter.log("Hello",false);
		
	}

}
