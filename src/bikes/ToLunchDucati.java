package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchDucati {
	@Test(groups = "smoke")
	public void Ducati() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ducati.com/");
		Reporter.log("DUCATI GOT LUNCHED", true);
		driver.quit();
	}

}

