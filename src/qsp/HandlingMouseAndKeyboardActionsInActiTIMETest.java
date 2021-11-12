package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAndKeyboardActionsInActiTIMETest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.get("https://demo.actitime.com/login.do");
//		Thread.sleep(2000);
//		WebElement untb = driver.findElement(By.xpath("//input[@id='username']"));
//		untb.sendKeys("admin");
//		Thread.sleep(1000);
		
		//Perform Double Click Action
		
//		Actions ac = new Actions(driver);
//		ac.doubleClick(untb).perform();
		Thread.sleep(1000);
	//	ac.keyDown(Keys.CONTROL).sendKeys("C").perform();
		
		
		//clicking on Password Text Box 
		
//		WebElement pwtb = driver.findElement(By.xpath("//input[@name='pwd']"));
//		pwtb.click();
//		ac.keyDown(Keys.CONTROL).sendKeys("V").perform();

		
		//Right click and Handle Right Clicked Actions
		
//		ac.contextClick(untb).perform();
//    	Thread.sleep(3000);
//		
//		
//		Robot r = new Robot();
//    	r.keyPress(KeyEvent.VK_C);
//    	r.keyRelease(KeyEvent.VK_C);
//    	
//    	Thread.sleep(2000);
//		WebElement pwtb = driver.findElement(By.xpath("//input[@name='pwd']"));
//		ac.contextClick(pwtb).perform();
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_P);
//		r.keyRelease(KeyEvent.VK_P);
		
		//or
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement untb = driver.findElement(By.xpath("//input[@id='username']"));
		untb.sendKeys("admin");
		Thread.sleep(1000);
		untb.sendKeys(Keys.CONTROL,"ac");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(Keys.CONTROL,"v");
		
		
	}

}
