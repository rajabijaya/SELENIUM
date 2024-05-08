package popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToHandleChildBrowserPopUp {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 15 Pro Max (256 GB) - Black Titanium']"))
				.click();

//		String parentId = driver.getWindowHandle();
//		ArrayList<String> childId = new ArrayList<String>(driver.getWindowHandles());
//		childId.remove(parentId);
//		driver.switchTo().window(childId.get(0));

		// To Capture Parent Id
		String parentId1 = driver.getWindowHandle();
		// To Capture All Id's
		Set<String> allId = driver.getWindowHandles();
		allId.remove(parentId1);
		for (String id : allId) {
			driver.switchTo().window(id);

			// To Take Screenshot Of Entire WebPage
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File src = new File("./errorShots/iPhone.png");
			FileHandler.copy(temp, src);
		}
	}
}
