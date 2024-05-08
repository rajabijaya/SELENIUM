package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestngDependsOnMethods {
	@Test
	public void CreateAcount() {
		Reporter.log("Created", true);
	}
	@Test
	public void EditAccount() {
		Reporter.log("Edited", true);
	}
	@Test(dependsOnMethods = {"EditAccount","CreateAcount"})
	public void DeleteAccount() {
		Reporter.log("Deleted", true);
	}

}
