package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchYamaha {
	@Test(groups = "Regression")
	public void Yamaha() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/yamaha-bikes.html");
		Reporter.log("Yamaha GOT LUNCHED", true);
		driver.quit();
	}

}
