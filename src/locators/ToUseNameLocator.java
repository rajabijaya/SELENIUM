package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("raja@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Raja@123455");
		

	}

}
