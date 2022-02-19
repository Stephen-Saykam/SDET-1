package qsp;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FlipkartVivo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
     WebElement	a=driver.findElement(By.xpath("//input[@class='_3704LK']"));
     a.sendKeys("VIVO");
     Thread.sleep(2000);
     a.sendKeys(Keys.DOWN);
     a.sendKeys(Keys.ENTER);
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[text()='vivo Y20A 2021 (Nebula Blue, 64 GB)']")).click();
//     JavascriptExecutor b = (JavascriptExecutor)driver;
//     b.executeScript(null, args)
     Thread.sleep(2000);
     driver.findElement(By.xpath("//li[@class='col col-6-12']")).click();
	}

}
