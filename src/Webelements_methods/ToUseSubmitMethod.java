package Webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("1234hfhfh");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("1234444455");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}

}
