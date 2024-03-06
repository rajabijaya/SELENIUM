package Webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreBooleanMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.instagram.com");
//		Thread.sleep(2000);
//		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
//		System.out.println("Before");
//		System.out.println(LoginButton.isDisplayed());
//		System.out.println(LoginButton.isEnabled());
//		System.out.println("------------------------------------------------");
//		System.out.println("After");
//		driver.findElement(By.name("username")).sendKeys("12sbhigrrwhigre");
//		driver.findElement(By.name("password")).sendKeys("whiwfwirgrig");
//		Thread.sleep(2000);
//		System.out.println(LoginButton.isDisplayed());
//		System.out.println(LoginButton.isEnabled());
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.xpath("//option[text()='INR 50 - INR 99 ( 1 ) ']"));
		System.out.println("BEFORE");
		System.out.println(select.isSelected());
		System.out.println("AFTER");
		select.click();
		System.out.println(select.isSelected());

	}

}
