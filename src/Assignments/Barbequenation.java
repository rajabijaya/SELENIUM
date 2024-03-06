package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Barbequenation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.barbequenation.com/");
		
		Thread.sleep(2000);
		String sessionId = driver.getWindowHandle();
		System.out.println(sessionId);
		
		String UrlofWebpage = driver.getCurrentUrl();
		System.out.println(UrlofWebpage);
		
		Dimension sizeOfBrowser = driver.manage().window().getSize();
		System.out.println(sizeOfBrowser);
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		
		driver.quit();

	}

}
