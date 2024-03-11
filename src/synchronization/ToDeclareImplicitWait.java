package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDeclareImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//To Declare Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("rajabijaya");
		driver.findElement(By.name("password")).sendKeys("gufwuffw123");

	}

}
