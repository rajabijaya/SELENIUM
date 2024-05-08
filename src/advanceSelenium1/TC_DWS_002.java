package advanceSelenium1;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass {

	String expectedData = "Computers";

	@Test
	public void ToClickOnComputers() {
		driver.findElement(By.partialLinkText("Computers")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
		if (expectedData == actualData) {
			Reporter.log("Navigated To Computer Page Successfully", true);
		} else {
			Reporter.log("Failed To Navigated To Computer Page", true);
		}
	}

}
