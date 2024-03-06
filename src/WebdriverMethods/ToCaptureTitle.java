package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();   //To lunch browser
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");    //Open Instagram
		Thread.sleep(2000);
		String TitleOfWebpage = driver.getTitle(); //Capture title
		System.out.println(TitleOfWebpage);

	}

}
