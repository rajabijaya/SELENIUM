package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class DemoWebShopCaptureCssProperty {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		WebElement color = driver.findElement(By.cssSelector("div[class='message-error']"));
		
		// driver.findElement(By.xpath("//span[contains(text(),'errors')]")).getText();
		// Thread.sleep(2000);
		// System.out.println(Errormsg);
		// Thread.sleep(2000);
		// WebElement error = driver.findElement(By.linkText("Errormsg"));
		// String c = Color.fromString(color).;
		Thread.sleep(2000);
		System.out.println(color.getCssValue("color"));

	}

}
