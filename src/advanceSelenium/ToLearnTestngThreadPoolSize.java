package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestngThreadPoolSize {
	@Test(invocationCount = 2,threadPoolSize = 2)
	public void Cricbuzz() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got executed", true);
		driver.quit();
	}

	@Test(invocationCount = 0)
	public void BaskinRobbins() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.BaskinRobbinsindia.com/");
		Reporter.log("BaskinRobbins got executed", true);
		driver.quit();
	}

	@Test(invocationCount = 6,threadPoolSize = 3)
	public void Amazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got executed", true);
		driver.quit();

	}

}
