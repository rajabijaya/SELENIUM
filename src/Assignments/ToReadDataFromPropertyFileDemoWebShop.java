package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFileDemoWebShop {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./testData/testData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url1");
		String GENDER = prop.getProperty("gender");
		String FIRSTNAME = prop.getProperty("firstname");
		String LASTNAME = prop.getProperty("lastname");
		String EMAIL = prop.getProperty("email");
		String PASSWORD = prop.getProperty("password1");
		String CONFIRMPASSWORD = prop.getProperty("cpass");

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
