package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindowPopups {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		
		//Hidden Division Popup will be opened
		WebElement uploadtn = driver.findElement(By.id("file-upload"));
		uploadtn.sendKeys("C:\\Users\\stephen\\OneDrive\\Desktop\\Stephen Saykam A.docx");
		
		
		//File Download Popup
		
//		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.selenium.dev/downloads/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//p[text()='Java']/following-sibling::p[@class='card-text m-0 pb-1']//a)[1]")).click();
//		
//		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
