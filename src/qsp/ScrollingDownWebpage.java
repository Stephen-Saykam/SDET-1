package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollingDownWebpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Upcasting From ChromeDriver to WebDriver Interface
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
//		//Thru TypeCasting
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		
//		//Thru DownCasting
//		RemoteWebDriver rwd = (RemoteWebDriver)driver;
//		rwd.executeScript("window.scrollBy(0,1000)");
		
		
		WebElement selSpons = driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
		Point loc = selSpons.getLocation();
		System.out.println(loc);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy"+loc);
		
		

	}

}
