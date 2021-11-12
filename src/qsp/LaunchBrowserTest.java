package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserTest {
	
	public static void main(String[] args) {
		
		//open the browser
		//Just create an object of browser class
		//Set the System Property
		// Key means Type of Browser
		// Value means Path of the driver exe file
		
		System.setProperty("webdriver.chrome.driver", "D:\\Qspd\\AuttomationProject\\drivers\\chromedriver.exe");
		//ChromeDriver s=
		
		new ChromeDriver().close();
		
		//s.close();

		System.setProperty("webdriver.gecko.driver", "D:\\Qspd\\AuttomationProject\\drivers\\geckodriver.exe");
		//FirefoxDriver driver = 
		
		new FirefoxDriver().close();
		
		//driver.close();

	}
}






