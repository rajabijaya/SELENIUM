package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.instagram.com/");
		String UrlofWebpage = driver.getCurrentUrl();
		System.out.println(UrlofWebpage);

	}

}
