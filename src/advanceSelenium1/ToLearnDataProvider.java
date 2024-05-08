package advanceSelenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	@DataProvider(name = "Credential")
	public String[][] toSendData() {

		String sarr[][] = { 
				{ "rajabijaya@gmail.com", "Raja@123" },
				{ "arghya@gmail.com", "Raja@123" },
				{ "raja@gmail.com", "Raja@123" } 
				};
		return sarr;
	}

	@Test(dataProvider = "Credential")
	public void login(String username, String password) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
