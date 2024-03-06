package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("email")).sendKeys("737465588");

		//driver.get("https://instagram.com");
		//Thread.sleep(2000);
		//driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("242343567");

	}

}
