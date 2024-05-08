package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.instagram.com");
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("rajabijaya",Keys.CONTROL+"a");
		userName.sendKeys(Keys.CONTROL+"c");
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys(Keys.CONTROL+"v");

	}

}
