package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		// To switch using webelement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);

		// Identify images
		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		// Identify Trash
		WebElement trashBox = driver.findElement(By.id("trash"));

		// To Perform Drag And Drop Actions
		Actions action = new Actions(driver);
		action.dragAndDrop(img1, trashBox).perform();
		Thread.sleep(2000);
//		action.dragAndDrop(img2, trashBox).perform();
		action.clickAndHold(img2).moveToElement(trashBox).release().perform();  //To Perform Click And Hold and Move To Element Actions
		Thread.sleep(2000);
//		action.dragAndDrop(img3, trashBox).perform();
		action.dragAndDropBy(img3, 400, 0).perform();   //To Perform Drag And Drop Actions
		Thread.sleep(2000);
		action.dragAndDrop(img4, trashBox).perform();
		Thread.sleep(2000);

		// To identify gallery
		WebElement gallery = driver.findElement(By.id("gallery"));

		action.dragAndDrop(img1, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(img2, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(img3, gallery).perform();
		Thread.sleep(2000);
		action.dragAndDrop(img4, gallery).perform(); 

	}

}
