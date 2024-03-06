package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class PolarBearApp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://polarbear.co.in/");
		
		Thread.sleep(2000);
		String TitleOfWebpage = driver.getTitle(); 
		System.out.println(TitleOfWebpage);
		driver.close();
		

	}
	

}
