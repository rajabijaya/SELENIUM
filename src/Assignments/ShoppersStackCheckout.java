package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStackCheckout {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Pro']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("560011");
		driver.findElement(By.id("Check")).click();
		

	}

}
