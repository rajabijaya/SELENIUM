package Webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTagname {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(1000);
		WebElement tryfreeButton = driver.findElement(By.linkText("Try Free"));
		Thread.sleep(1000);
		System.out.println(tryfreeButton.getTagName());

	}

}
