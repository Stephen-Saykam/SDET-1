package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Ask me later']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Login/ Register']")).click();
		Actions ac = new Actions(driver);
//		WebElement Login/Register = driver.findElement(By.xpath("//span[text()='Login/ Register']"));
//		ac.moveToElement(Login/Register).perform();
		

	}

}
