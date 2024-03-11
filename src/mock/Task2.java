package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.vtiger.com/");
		driver.findElement(By.partialLinkText("Resources")).click();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String number = driver.findElement(By.xpath("//p[contains(text(),1'+91 9243602352']")).getText();
		System.out.println(number);
		driver.quit();

	}

}
