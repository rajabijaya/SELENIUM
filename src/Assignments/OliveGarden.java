package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class OliveGarden {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.olivegarden.com/");
		
		Dimension sizeOfBrowser = driver.manage().window().getSize();
		System.out.println(sizeOfBrowser);
		
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		
		driver.close();

	}

}
