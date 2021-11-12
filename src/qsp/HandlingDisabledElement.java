package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///D:/HTML/DisabledElement.html");
		
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).sendKeys("admin");
		Thread.sleep(2000);
		WebElement pwtb = driver.findElement(By.id("i2"));
		
		if(pwtb.isEnabled())
		{
			System.out.println("Password textbox is enabled, Handle Normally");
			pwtb.sendKeys("manager");
		}
		else
		{
			System.out.println("Password textbox is Disabled, Handle through JS");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementById('i2').value=\"manager\"");
			
		}

		
	}

}
