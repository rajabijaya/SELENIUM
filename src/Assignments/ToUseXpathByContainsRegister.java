package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByContainsRegister {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);

		String Errormsg = driver.findElement(By.xpath("//span[contains(text(),'First name')]")).getText();
		System.out.println(Errormsg);

		String Errormsg1 = driver.findElement(By.xpath("//span[contains(text(),'Last name')]")).getText();
		System.out.println(Errormsg1);

		String Errormsg2 = driver.findElement(By.xpath("//span[contains(text(),'Email')]")).getText();
		System.out.println(Errormsg2);

		String Errormsg3 = driver.findElement(By.xpath("//span[contains(text(),'Password')]")).getText();
		System.out.println(Errormsg3);

		String Errormsg4 = driver.findElement(By.xpath("//span[contains(text(),'Password')]")).getText();
		System.out.println(Errormsg4);

	}

}
