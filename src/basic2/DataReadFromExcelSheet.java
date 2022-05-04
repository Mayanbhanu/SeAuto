package basic2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataReadFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
	FileInputStream fis= new FileInputStream("./data.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
String url	=wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
String username	=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
String password	=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();

WebDriver driver= new ChromeDriver();
driver.get(url);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys(username);
driver.findElement(By.id("pass")).sendKeys(password);








	
	
	

	}

}
