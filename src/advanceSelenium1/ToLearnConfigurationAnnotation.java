package advanceSelenium1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToLearnConfigurationAnnotation {
	
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Before Suite got executed", true);
	}
	@AfterSuite
	public void aftersuite() {
		Reporter.log("After Suite got executed", true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("Before test got executed", true);
	}
	@AfterTest
	public void sftertest() {
		Reporter.log("After Test got executed", true);
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("Before Class got executed", true);
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("After class got executed", true);
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Before Method got executed", true);
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("After Method got executed", true);
	}
	@Test
	public void testCase() {
		Reporter.log("TC Got Executed", true);
	}

}
