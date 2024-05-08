package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNgInvocationCount {

	@Test(priority = 4, invocationCount = 2)
	public void Cricbuzz() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got executed", true);
		driver.quit();
	}

	@Test(priority = 0, invocationCount = 0)
	public void BaskinRobbins() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.BaskinRobbinsindia.com/");
		Reporter.log("BaskinRobbins got executed", true);
		driver.quit();
	}

	@Test(priority = 4, invocationCount = 2)
	public void Amazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got executed", true);
		driver.quit();

	}
}
