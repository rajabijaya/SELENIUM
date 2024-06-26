package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// constructor
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "Email")
	private WebElement usernameTextfield;

	@FindBy(id = "Password")
	private WebElement passwordTextfield;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
