package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethod {

	public static void main(String[] args) throws InterruptedException {
	//open browser
		ChromeDriver driver = new ChromeDriver(); 
	//navigate through url 
		driver.get("http://www.facebook.com/"); 
	//maximize  //Method Chaining	
	    driver.manage().window().maximize();    
	//wait for 2 sec
		Thread.sleep(2000);                     
    //minimize
        driver.manage().window().minimize();    
	//To fullscreen
		driver.manage().window().fullscreen();
	//To get the size
		Dimension sizeOfBrowser = driver.manage().window().getSize();
		System.out.println(sizeOfBrowser);
	//To set the size(1st Way)
		driver.manage().window().setSize(new Dimension(500, 600));
	//To set the size(2nd way)
		Dimension d = new Dimension(1000, 500);
		driver.manage().window().setSize(d);
	//To get position
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
	//To set position(1st Way)
		driver.manage().window().setPosition(new Point(170, 80));
	//To set position(2nd Way)
		Point p = new Point(170,50);
		driver.manage().window().setPosition(p);
		
	}

}
    