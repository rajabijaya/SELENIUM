package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchKawasaki {
	
	@Test(groups = "smoke")
	public void Kawasaki() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://kawasaki-india.com/");
		Reporter.log("KAWASAKI GOT LUNCHED", true);
		driver.quit();
	}

}
