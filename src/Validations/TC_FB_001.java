package Validations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FB_001 {

	public static void main(String[] args) {
		
		//Expected Data
		
		String expectedUsername = "9437470273";
		String expectedPassword = "Raja@123";
		String expectedLoginPageTitle = "Facebook – log in or sign up";
		
		//Step 1 :- Open The Browser
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser got lunched Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got Maximized Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Step 2 :- Enter The URL
		
		driver.get("https://www.facebook.com/");
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Successfully navigate to Facebook LoginPage");
		}
		else {
			System.out.println("Failed to navigate to Facebook LoginPage");
		}
		
		//Step 3 :- Enter The Username
		
		WebElement usernameTextfield = driver.findElement(By.id("email"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(expectedUsername);
		String actualUsername = usernameTextfield.getAttribute("value");
		if(actualUsername.equals(expectedUsername)) {
			System.out.println("Username Textfield Accepted data");
		}
		else {
			System.out.println("Username Textfield not Accepted data");
		}
		
		//Step 4 :- Enter The Password
		
		WebElement passwordTextfield = driver.findElement(By.id("pass"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(expectedPassword);
		String actualPassword = passwordTextfield.getAttribute("value");
		if(actualPassword.equals(expectedPassword)) {
			System.out.println("password Textfield Accepted Data");
		}
		else {
			System.out.println("password Textfield not Accepted Data");
		}
		
		//Step 5 :- Click On Login Button
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		System.out.println("HomePage is Displayed");
		
		//To Close
		System.out.println("Browser got closed successfully");
		driver.quit();
		
		
		

	}

}
