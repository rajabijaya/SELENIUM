package Validations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogoIsDisplayedOrNot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com");
		boolean fbLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		if(fbLogo==true) {
			System.out.println("Facebook Logo Is Displaying");
		}
		else {
			System.out.println("Facebook Logo is Not Displaying");
		}

	}

}
