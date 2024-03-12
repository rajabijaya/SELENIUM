package dropdown_handing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement MultiSelectListbox = driver.findElement(By.id("cars"));
		
		//To Handle
		Select multiselect = new Select(MultiSelectListbox);
		System.out.println(multiselect.isMultiple());
		
		//call methods
		multiselect.selectByIndex(0);
		multiselect.selectByValue("99");
		Thread.sleep(3000);
		
		//To Deselect
		
		//multiselect.deselectByIndex(0);
		//multiselect.deselectByValue("99");
		multiselect.deselectAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
