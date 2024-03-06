package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSessionId {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		String sessionId = driver.getWindowHandle();
		System.out.println(sessionId);                 //A4EE5860DD7F84479B954396A8339C17
		                                               //FC491AE33EF2226E86A72486A78A61CE
		

	}

}
