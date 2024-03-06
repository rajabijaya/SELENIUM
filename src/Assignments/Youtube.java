package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String UrlofWebpage = driver.getCurrentUrl();
		System.out.println(UrlofWebpage);
		driver.close();

	}

}
