package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPopups {

	public static void main(String[] args) throws InterruptedException {
		
		//Handling Alert Popups
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("file:///D:/HTML/Alert.html");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(2000);
//		System.out.println(al.getText());
//		Thread.sleep(2000);
//		al.accept();
		
		//Handling Confirm Popus
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("file:///D:/HTML/Confirm.html");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='I Love You']")).click();
//		Thread.sleep(2000);
//		
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(2000);
//		System.out.println(al.getText());
//		Thread.sleep(2000);
//		//To click on OK Button
//		//al.accept();
//		//To click on Cancel Button
//		al.dismiss();
		
		
		//Handling Hidden Division Popups
		
//		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.cleartrip.com/");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@class=\'flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900\']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[contains(@aria-label,'Oct')]/descendant::div[text()='28']")).click();
		
		//Handling Notification Popups
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Change the browser Settings
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("start-maximized");
	
		//Open the Browser with Changes
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.yatra.com/");
		
		
		
		
		
		

	}

}
