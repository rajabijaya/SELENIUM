package advanceSelenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void toLunch(@Optional("Chrome")String browsername) {
		if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		Reporter.log("BROWSER GOT LUNCHED SUCCESSFULLY", true);
		driver.manage().window().maximize();
		Reporter.log("BROWSER GOT MAXIMIZED SUCCESSFULLY", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("SeleniumE1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@AfterMethod
	public void toLogout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("LOGGED OUT SUCCESSFULLY", true);
	}

	@AfterClass
	public void toCLose() {
		Reporter.log("BROWSER CLOSED SUCCESSFULLY", true);
		driver.quit();
	}

}
