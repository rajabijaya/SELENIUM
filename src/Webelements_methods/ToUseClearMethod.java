package Webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(1000);
		WebElement usernameTextfield = driver.findElement(By.id("username"));
		usernameTextfield.clear();
		Thread.sleep(1000);
		usernameTextfield.sendKeys("RAJA");
		
		WebElement passwordTextfield = driver.findElement(By.id("password"));
		Thread.sleep(1000);
		passwordTextfield.clear();
		passwordTextfield.sendKeys("RAJAcvhcchg");
		

	}

}
