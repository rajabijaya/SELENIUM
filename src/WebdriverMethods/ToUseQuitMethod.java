package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseQuitMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://www.instagram.com/");
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		driver.quit();

	}

}
