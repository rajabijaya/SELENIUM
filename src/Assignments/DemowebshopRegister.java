package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebshopRegister {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();

		Thread.sleep(1000);
		driver.findElement(By.id("gender-male")).click();

		driver.findElement(By.id("FirstName")).sendKeys("Raja");
		Thread.sleep(1000);

		driver.findElement(By.id("LastName")).sendKeys("Bijaya");
		Thread.sleep(1000);

		driver.findElement(By.id("Email")).sendKeys("rajabijaya@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.id("Password")).sendKeys("Raja@1234");
		Thread.sleep(1000);

		driver.findElement(By.id("ConfirmPassword")).sendKeys("Raja@1234");
		Thread.sleep(1000);

		driver.findElement(By.id("register-button")).click();

	}

}
