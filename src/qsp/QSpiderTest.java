package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QSpiderTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("qspiders");
		Thread.sleep(10000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(allOptions.size());
		Thread.sleep(5000);
		for(int i=0; i<=allOptions.size()-1; i++)
		{
			System.out.println(allOptions.get(i).getText());
			
		}
		Thread.sleep(2000);
		
		for(int i=0; i<=allOptions.size()-1; i++)
		{
			if(allOptions.get(i).getText().equals("qspiders fees"))
			{
				allOptions.get(i).click();
				break;
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
