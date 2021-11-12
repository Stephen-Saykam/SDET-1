package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\'flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[local-name()='svg' and @class='c-pointer c-secondary-500']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='flex-1 ta-right']//*[local-name()='svg' and @class='c-pointer c-secondary-500']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@aria-label,'Dec')]//div[text()='28']")).click();
		
		

	}

}
