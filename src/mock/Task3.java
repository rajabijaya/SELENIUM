package mock;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		File temp = driver.findElement(By.xpath("//div[contains(@class,'sc-gJqsIT bdDCMj logo')]/IMG[normalize-space(@role)='presentation']")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/zomatologo.jpeg");
		FileHandler.copy(temp, src);

	}

}
