package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClickActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement addButton = driver.findElement(By.id("add"));
		
		//To Perform Double Click
		Actions action = new Actions(driver);
		action.doubleClick(addButton).perform();
		Thread.sleep(2000);
		action.doubleClick(addButton).perform();

	}

}
