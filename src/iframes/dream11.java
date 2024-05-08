package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dream11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.dream11.com/");

		// To switch using index
		// driver.switchTo().frame(0);

		// To switch by using string id or name
		// driver.switchTo().frame("send-sms-iframe");

		// To switch using webelement
		   WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe ExampleS']"));
		   driver.switchTo().frame(iframe);

		driver.findElement(By.id("regEmail")).sendKeys("8584848564");

		// Switch Back
		// driver.switchTo().parentFrame(); //parent Frame
		driver.switchTo().defaultContent(); // main frame
		driver.findElement(By.linkText("About Us")).click();

	}

}
