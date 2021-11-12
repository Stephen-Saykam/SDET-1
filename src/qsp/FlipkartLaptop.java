package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipkartLaptop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement ddAddr = driver.findElement(By.xpath("//input[@name='q']"));
		ddAddr.sendKeys("laptops");
		Thread.sleep(2000);
		ddAddr.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		ddAddr.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3uDYxP']/descendant::option[@value='50000']")).click();
		
		Thread.sleep(3000);
		//selection of Processor: i3		
		driver.findElement(By.xpath("//div[text()='Core i3']/ancestor::label[@class='_2iDkf8 t0pPfW']/descendant::div[@class='_24_Dny']")).click();
		
		//Selection of Brand: Dell
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='DELL']/ancestor::label[@class='_2iDkf8 t0pPfW']/descendant::div[@class='_24_Dny']")).click();
		
		//Print the Prices of All the Laptops
		Thread.sleep(3000);
		List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0; i<allPrices.size()-1; i++)
		{
			System.out.println(allPrices.get(i).getText());
		}
		
		
		
		
		
		

	}

}
