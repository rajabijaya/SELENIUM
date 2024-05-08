package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcelDemoWebShop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		
		String URL = wb.getSheet("Sheet1").getRow(3).getCell(0).toString();
		String FIRSTNAME = wb.getSheet("Sheet1").getRow(4).getCell(0).toString();
		String LASTNAME = wb.getSheet("Sheet1").getRow(5).getCell(0).toString();
		String EMAIL = wb.getSheet("Sheet1").getRow(6).getCell(0).toString();
		String PASSWORD = wb.getSheet("Sheet1").getRow(7).getCell(0).toString();
		String CONFIRMPASSWORD = wb.getSheet("Sheet1").getRow(8).getCell(0).toString();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		driver.get(URL);
		//driver.findElement(By.xpath("//label[text()='Gender:'"+GENDER+"']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
		driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CONFIRMPASSWORD);
		//driver.findElement(By.id("register-button")).click();

	}

}
