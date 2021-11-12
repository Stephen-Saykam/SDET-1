package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAndKeyboardActions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//Performing Moouse Hover Action
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		//driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		
//		Actions ac = new Actions(driver);
//		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
//		ac.moveToElement(fashion).perform();
		
		
		
		
		//Performing Double Click Action
		
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.actitime.com/login.do");
//		Thread.sleep(2000);
//		WebElement untb = driver.findElement(By.xpath("//input[@id='username']"));
//		untb.sendKeys("admin");
//		Thread.sleep(1000);
//		
//		Actions ac = new Actions(driver);
//		ac.doubleClick(untb).perform();
		
		
		
		//Perfoming Right Click & Right Clicked options
		
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("file:///D:/HTML/link.html");
//		Thread.sleep(3000);
//		
//		Actions ac = new Actions(driver);
//		WebElement linkAddress = driver.findElement(By.id("i1"));
//		ac.contextClick(linkAddress).perform();
//		Thread.sleep(3000);
//		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_T);
//		r.keyRelease(KeyEvent.VK_T);
		
		
		
		
		//Perform Drag And Drop Actions
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
		
		Actions ac = new Actions(driver);
		WebElement src = driver.findElement(By.id("box6"));
		WebElement dest = driver.findElement(By.id("box106"));
		ac.dragAndDrop(src, dest).perform();
		
		
	}

}
