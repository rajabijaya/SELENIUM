package Validations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProperlyAllignOrNot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com");
		int rect = driver.findElement(By.id("email")).getRect().getX();
		int rect1 = driver.findElement(By.id("pass")).getRect().getX();
		System.out.println(rect);
		System.out.println(rect1);
		if(rect==rect1) {
			System.out.println("Properly Alligned");
		}
		else {
			System.out.println("Not Properly Alligned");
		}

	}

}
