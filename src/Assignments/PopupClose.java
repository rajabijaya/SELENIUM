package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupClose {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();

		driver.get("https://www.woodenstreet.com/");
		for (;;) {
			try {
				WebElement popup = driver.findElement(By.id("loginclose1"));
				popup.click();
				break;
			} catch (Exception e) {
				Thread.sleep(2000);
			}
		}
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
		for (WebElement ele : elements) {
			System.out.println(ele.getText());
		}

	}
}
