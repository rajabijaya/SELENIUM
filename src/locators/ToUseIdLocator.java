package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Testing@123");
		

	}

}
