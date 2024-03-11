package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.xpath("//img[@alt='Woodenstreet Best 3 Seater Sofas']")).click();
		driver.findElement(By.xpath("//h3[normalize-space(.)='Berlin 3 Seater Sofa (Velvet, Indigo Blue)']")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();
		driver.quit();

	}

}
