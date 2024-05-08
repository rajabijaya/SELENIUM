package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchBmw {
	
	@Test(groups = "Regression")
	public void Bmw() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bmw-motorrad.in/en/models/modeloverview.html");
		Reporter.log("BMW GOT LUNCHED", true);
		driver.quit();
	}

}
