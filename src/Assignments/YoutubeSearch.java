package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);

		driver.findElement(By.name("search_query")).sendKeys("WAALIAN");
		Thread.sleep(2000);

		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//a[@title='Waalian : Harnoor (Full Song) Gifty | The Kidd | Rubbal GTR | Punjabi Song | JattLife Studios']"))
				.click();
		Thread.sleep(2000);
		// FULL SCREEN
		driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
		Thread.sleep(10000);
		// AD-SKIP
		driver.findElement(By.id("ad-text:6"));
		Thread.sleep(20000);
		//
		driver.findElement(By.className("yt-spec-touch-feedback-shape__fill")).click();

	}

}
