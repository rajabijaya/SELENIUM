package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebshopRegister {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Raja");
		driver.findElement(By.id("LastName")).sendKeys("Bijaya");
		driver.findElement(By.id("Email")).sendKeys("rajabijaya@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Raja@1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Raja@1234");
		driver.findElement(By.id("register-button")).click();

	}

}
