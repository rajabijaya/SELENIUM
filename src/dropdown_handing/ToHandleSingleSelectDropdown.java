package dropdown_handing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/signup");

		// To Locate DropDown
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));

		// To Handle DropDown
		Select daySelect = new Select(dayDropdown);
		Select monthSelect = new Select(monthDropdown);
		Select yearSelect = new Select(yearDropdown);

		// call methods
//		daySelect.selectByIndex(16);
//		monthSelect.selectByIndex(3);
//		yearSelect.selectByIndex(26);

		daySelect.selectByIndex(16);
		monthSelect.selectByValue("4");
		yearSelect.selectByVisibleText("1998");

		// To check weather it is singleselect or multi select.
		// System.out.println(daySelect.isMultiple()); //false

		// To Get every options present in the DropDown

		List<WebElement> allMonths = monthSelect.getOptions();
		for (WebElement month : allMonths) {
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText()); // magic
			Thread.sleep(2000);
		}

	}
}
