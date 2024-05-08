package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//To switch to frame
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
	  
		//To Handle Alert PopUp
		Alert alertPopup = driver.switchTo().alert();
		System.out.println(alertPopup.getText());
		alertPopup.accept();
		//alertPopup.dismiss(); //It also Work only in Alert popup

	}

}
