package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebdriverMethods.ToLunchChromeBrowser;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Create Object Of Fis
		FileInputStream fis = new FileInputStream("./testData/testData.properties");
		
		//Create Object of Respective File Type
		Properties prop = new Properties();
		
		//Call Methods
		prop.load(fis);
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
