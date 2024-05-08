package advanceSelenium1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass {
	String expectedData = "Books";

	@Test
	public void ToClickOnBook() {
		driver.findElement(By.partialLinkText("Books")).click();
		String actualData = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
//		if (expectedData == actualData) {
//			Reporter.log("Navigated To Books Page Successfully", true);
//		} else {
//			Reporter.log("Failed To Navigated To Books Page", true);
//		}
		Assert.assertEquals(expectedData,actualData, "Failed To Navigated To Books Page");
	}

}
