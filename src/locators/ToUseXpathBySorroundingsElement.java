package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathBySorroundingsElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//Span[text()='APPLE iPhone 14 Pro']/../..//button[@type='button']")).click();

	}

}
