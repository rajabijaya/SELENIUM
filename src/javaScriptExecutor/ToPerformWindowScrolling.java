package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformWindowScrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Cars",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Images']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(;;) {
		try {
			driver.findElement(By.xpath("//img[@alt='Top Expensive Cars in the World 2023: 1963 Ferrari 250 GTO, Rolls-Royce  Boat Tail and More - MySmartPrice']")).click();
			break;
		}catch (Exception e) {
			js.executeScript("window.scrollBy(0,500)");
		}

	}
}

}