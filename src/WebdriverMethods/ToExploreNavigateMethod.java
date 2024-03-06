package WebdriverMethods;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethod {

	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//To (String URL)
		//driver.navigate().to("https://www.instagram.com/");
		//To (URL URL)
		//driver.navigate().to(new URL("https://www.instagram.com/"));
		
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		driver.quit();
		
		

	}

}
