package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		Thread.sleep(2000);
		String SourceCode = driver.getPageSource();
		System.out.println(SourceCode);

	}

}
